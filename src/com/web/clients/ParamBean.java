package com.web.clients;

import java.util.HashMap;

public class ParamBean {
	// �ӿ�����
	private String desc;
	// ����host��������ip������
	private String host;
	// ����uri
	private String uri;
	// ���󷽷�
	private String method;
	// ����ͷ��
	private HashMap<String, String> headersMap;
	// ����body��û����Ϊ�ա����磺"body": ""
	private String body;
	// ������Ӧ
	private String response;
	// ���У�飺����ֵ
	private String expectValue;
	// ���У�飺ʵ��ֵ
	private String actualVlaue;
	// ������ȡ����������������滻ԭ�б�����ֵ
	private String variable;
	// ���ݿ⡣��ʱ����ΪJDBC��Uri·������߽���sql��䡣���磺jdbc:mysql://localhost:3306/RUNOOB?sql=""
	private String sql;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
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
