package ch11;

import java.util.Enumeration;
import java.util.Properties;

class PropertiesEx1 {
	public static void main(String[] args) {
		Properties prop = new Properties();

		prop.setProperty("timeout","30");
		prop.setProperty("language","kr");
		prop.setProperty("size","10");
		prop.setProperty("capacity","10");

		Enumeration e = prop.propertyNames(); //iterator 구버전

		while(e.hasMoreElements()) {
			String element = (String)e.nextElement();
			System.out.println(element + "="+ prop.getProperty(element));
		}

		System.out.println();

		System.out.println(prop.setProperty("size","20")); //덮어쓰기 - 기존의 값 반환
		System.out.println("size=" + prop.getProperty("size"));
		System.out.println("capacity=" + prop.getProperty("capacity", "20")); //키가 존재하지 않는 경우 default value 지정
		System.out.println("loadfactor=" + prop.getProperty("loadfactor", "0.75"));

		System.out.println();

		System.out.println(prop);

		System.out.println();

		prop.list(System.out); //모든 데이터를 출력하는 메서드
	}
}
