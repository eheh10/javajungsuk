package ch11.v2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class HashSetEx4 {
	public static void main(String[] args) {
		Set set = new HashSet();

		// add 메서드는 요소 추가 전에 equals() 와 hashCode() 를 호출
		set.add("abc");
		set.add(new String("abc"));
		set.add(new Person2("David",10));
		set.add(new Person2("David",10));

		System.out.println(set);
	}
}

class Person2 {
	String name;
	int age;

	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// equals(), hashCode() 오버라이딩 필요
	// -> 같은 객체로 간주하는 기준이 된다
	// name, age 가 같으면 true 를 반환
	public boolean equals(Object obj) {
		if(obj instanceof Person2) {
			Person2 tmp = (Person2)obj;
			return name.equals(tmp.name) && age==tmp.age;
		}

		return false;
	}

	public int hashCode() {
		//String 클래스의 hashCode 를 활용
		//return (name+age).hashCode();
		return Objects.hash(name,age); //jdk1.8 부터
	}

	public String toString() {
		return name +":"+ age;
	}
}
