package ch11;

import java.util.Properties;

class PropertiesEx4 {
	public static void main(String[] args) {
		// 시스템 속성 가져오기

		Properties prop = System.getProperties();

		System.out.println("java.version:" + prop.getProperty("java.version"));
		System.out.println("user.language:" + prop.getProperty("user.language"));

		System.out.println();
		prop.list(System.out);
	}
}
