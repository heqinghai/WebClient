package com.business.web.param;

import java.util.HashMap;

import com.web.clients.common.CommonConfig;
import com.web.clients.util.Util;

/**
 * 存放C端登录接口依赖参数，每一个接口维护一个依赖的参数文件
 * 
 * @author hqh
 *
 */
public class WebLoginParam {
	/**
	 * 接口描述
	 */
	private String desc = "C端登录";

	/**
	 * 请求host，可以是ip、域名
	 */
	private String host = CommonConfig.HOST;

	/**
	 * 请求uri
	 */
	private String uri = "web/api/account/login?_t=" + Util.getCurrentTimeMillis();

	/**
	 * 请求方法
	 */
	private String method = "post";

	/**
	 * 请求头部
	 */
	private HashMap<String, String> headersMap = new HashMap<>();
	{
		headersMap.put("Accept", "application/json, text/plain, */*");
		headersMap.put("Connection", "keep-alive");
		headersMap.put("Content-Type", "application/json;charset=UTF-8");
		headersMap.put("Accept-Language", "zh-CN,zh;q=0.9");
		headersMap.put("Accept-Encoding", "gzip, deflate");
	}

	/**
	 * 请求body，没有则为空。比如："body": ""
	 */
	private String body = "{\"loginNo\":\"18680000222\",\"password\":\"abc123\",\"couplingFace\":true,\"platform\":1}";

	/**
	 * 请求响应
	 */
	private String response = "";

	/**
	 * 结果校验：期望值
	 */
	private String expectValue = "";

	/**
	 * 结果校验：实际值
	 */
	private String actualVlaue = "";

	/**
	 * 变量提取。如果变量重名则替换原有变量的值
	 */
	private String variable = "";

	/**
	 * 数据库。暂时定义为JDBC的Uri路径，后边接上sql语句。比如：jdbc:mysql://localhost:3306/RUNOOB?sql=
	 * ""
	 */
	private String sql = "";

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public HashMap<String, String> getHeadersMap() {
		return headersMap;
	}

	public void setHeadersMap(HashMap<String, String> headersMap) {
		this.headersMap = headersMap;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getExpectValue() {
		return expectValue;
	}

	public void setExpectValue(String expectValue) {
		this.expectValue = expectValue;
	}

	public String getActualVlaue() {
		return actualVlaue;
	}

	public void setActualVlaue(String actualVlaue) {
		this.actualVlaue = actualVlaue;
	}

	public String getVariable() {
		return variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}
}
