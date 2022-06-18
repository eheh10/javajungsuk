package ch11.v2;

import java.util.HashSet;

class HashSetEx3 {
	public static void main(String[] args) {
		HashSet set = new HashSet();

		set.add("abc");
		set.add("abc");
		set.add(new Person("David",10));
		// 이름,나이가 같지만
		// 주소값이 다른 인스턴스이므로 중복으로 간주되지 않는다
		set.add(new Person("David",10));

		System.out.println(set);
	}
}

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name +":"+ age;
	}
}
