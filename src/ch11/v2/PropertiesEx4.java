package ch11.v2;

import java.util.Properties;

class PropertiesEx4 {
	public static void main(String[] args) {
		Properties prop = System.getProperties();

		System.out.println("java.version:" + prop.getProperty("java.version"));
		System.out.println("user.language:" + prop.getProperty("user.language"));

		System.out.println();
		prop.list(System.out);
	}
}
