package com.test;

import java.io.IOException;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HttpClientDemo {
	public static void main(String[] args) throws ParseException, IOException {
		// String fielPath = "";
		// ArrayList<String> fileList = FileForEach.getFileList(fielPath);
		// System.out.println(fileList);
		// System.out.println("�ļ�����" + fileList.size());
		//
		// for (String pathStr : fileList) {
		// JSONArray jsonArray = JsonToArray.jsonToArrays(pathStr);
		// CreateHttp httpClient = new CreateHttp(jsonArray);
		// ParamBean pb = httpClient.getParamBean();
		// System.out.println("describe --> " + pb.getDesc());
		// System.out.println("host --> " + pb.getHost());
		// System.out.println("uri --> " + pb.getUri());
		// System.out.println("headers --> " + pb.getHeadersMap());
		// System.out.println("body --> " + pb.getBody());
		// System.out.println("method --> " + pb.getMethod());
		// System.out.println("response --> " + pb.getResponse());
		// System.out.println("expectValue --> " + pb.getExpectValue());
		// System.out.println("actualVlaue --> " + pb.getActualVlaue());
		// System.out.println("variable --> " + pb.getVariable());
		// System.out.println("sql --> " + pb.getSql());
		// }

		// ������ֵ
		// String setVarString = "asdf&{var1:response.data}Sdc";
		// Pattern pPattern = Pattern.compile("\\&\\{\\w.*\\}");
		// Matcher pMatcher = pPattern.matcher(setVarString);
		// while (pMatcher.find()) {
		// String childString = pMatcher.group();
		// System.out.println("ƥ�䵽�ĸ�����" + childString);
		// Pattern cPattern = Pattern.compile("\\w+:\\w+\\.?\\w+");
		// Matcher cMatcher = cPattern.matcher(childString);
		// while (cMatcher.find()) {
		// System.out.println("ƥ�䵽���Ӵ���" + cMatcher.group());
		// }
		// }

		// ȡ������
		String getVarString = "adf${var2}asdf";
		Pattern pPattern = Pattern.compile("\\$\\{\\w.*\\}");
		Matcher pMatcher = pPattern.matcher(getVarString);
		while (pMatcher.find()) {
			String childString = pMatcher.group();
			System.out.println("ƥ�䵽�ĸ�����" + childString);
			Pattern cPattern = Pattern.compile("\\w+");
			Matcher cMatcher = cPattern.matcher(childString);
			while (cMatcher.find()) {
				System.out.println("ƥ�䵽���Ӵ���" + cMatcher.group());
			}
		}

	}
}
