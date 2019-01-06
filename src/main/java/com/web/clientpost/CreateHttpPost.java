package com.web.clientpost;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.entity.StringEntity;

import com.web.clients.InterfaceCreateHttp;

/**
 * 
 * @author hqh
 * @date 2018年11月24日23:25:41
 *
 */

public class CreateHttpPost implements InterfaceCreateHttp {

	HttpPost httpPost;

	public CreateHttpPost(String host, String uri, HashMap<String, String> headersMap, String strBody) {
		this.httpPost = new HttpPost(host + uri);
		if (!headersMap.isEmpty()) {
			for (Map.Entry<String, String> tempMap : headersMap.entrySet()) {
				// System.out.println(tempMap.getKey() + "--> " +
				// tempMap.getValue());
				this.httpPost.addHeader(tempMap.getKey(), tempMap.getValue());
			}
		}
		StringEntity se = new StringEntity(strBody, "utf-8");
		this.httpPost.setEntity(se);
		// 配置请求超时时间
		RequestConfig rc = RequestConfig.custom().setConnectTimeout(15000).setConnectionRequestTimeout(15000)
				.setSocketTimeout(15000).build();
		this.httpPost.setConfig(rc);
	}

	@Override
	public HttpPost httpPost() {
		return this.httpPost;
	}

	@Override
	public HttpGet httpGet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpPut httpPut() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpDelete httpDelete() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpPatch httpPatch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpOptions httpOptions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpTrace httpTrace() {
		// TODO Auto-generated method stub
		return null;
	}

}
