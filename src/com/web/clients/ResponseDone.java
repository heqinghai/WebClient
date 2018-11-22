package com.web.clients;

import java.io.IOException;
import java.text.ParseException;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;

public class ResponseDone {

	public static String doneRespone(ParamBean paramBean) throws ParseException, IOException {

		// todo:����http����
		HttpClientAdapter httpClientAdapter = new HttpClientAdapter(paramBean);
		CloseableHttpResponse response = httpClientAdapter.executeHttp(paramBean);
		System.out.println("*********************status: *********************");
		System.out.println(response.getStatusLine());
		System.out.println("*********************header: *********************");
		Header[] resHeader = response.getAllHeaders();
		for (Header header : resHeader) {
			System.out.println(header.getName() + " --> " + header.getValue());
		}
		HttpEntity resEntity = response.getEntity();
		System.out.println("*********************response: *********************");
		String responseStr = EntityUtils.toString(resEntity);
		System.out.println(responseStr);
		// todo:����ӦУ��

		// todo:������ȡ����Ҫ�ŵ�ȫ�ֱ����������������ظ�
		return responseStr;

	}
}
