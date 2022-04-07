package ch11;

import java.util.HashSet;
import java.util.Objects;

class HashSetEx4 {
	public static void main(String[] args) {
		HashSet set = new HashSet();

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

	// equals(), hashCode() 오버라이딩 -> 기존에 저장된 요소와 같은지 판별 가능
	public boolean equals(Object obj) {
		if(obj instanceof Person2) {
			Person2 tmp = (Person2)obj;
			return name.equals(tmp.name) && age==tmp.age;
		}

		return false;
	}

	public int hashCode() {
		//return (name+age).hashCode(); //String 클래스의 hashCode()
		return Objects.hash(name,age); //jdk1.8 부터
	}

	public String toString() {
		return name +":"+ age;
	}
}
