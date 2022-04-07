package ch11;

import java.util.*;

class HashSetLotto {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		for (int i = 0; set.size() < 6 ; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(num); //오토박싱
		}

		List list = new LinkedList(set);
		Collections.sort(list); //Integer 클래스의 기본 정렬 - 오름차순 정렬
		System.out.println(list);
	}
}
