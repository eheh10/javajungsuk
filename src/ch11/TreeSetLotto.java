package ch11;

import java.util.Set;
import java.util.TreeSet;

class TreeSetLotto {
	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for (int i = 0; set.size() < 6 ; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(num); //오토 박싱
		}

		System.out.println(set); //정렬 하지 않아도 정렬 되어 출력
	}
}
