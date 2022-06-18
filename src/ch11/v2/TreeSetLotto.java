package ch11.v2;

import java.util.Set;
import java.util.TreeSet;

class TreeSetLotto {
	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for ( ; set.size() < 6 ; ) {
			int num = (int)(Math.random()*45) + 1;
			set.add(num);
		}

		System.out.println(set); //별도이 정렬 없이도 정렬 되어 출력
	}
}
