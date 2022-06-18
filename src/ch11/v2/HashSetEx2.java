package ch11.v2;

import java.util.*;

class HashSetEx2 {
	public static void main(String[] args) {
		Set set = new HashSet();

		for( ; set.size() < 6; ) {
			int num = (int) (Math.random()*45) + 2;
//			set.add(new Integer(num));
			set.add(num);
		}
		System.out.println(set);

		//정렬
		List list = new LinkedList<>(set);
		Collections.sort(list); //Integer 클래스의 기본정렬
		System.out.println(list);
	}
}
