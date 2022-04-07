package ch11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class IteratorEx1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("순서");
		list.add("유지");
		list.add("테스트");
		list.add("과연");
		list.add("결과는");

		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

		System.out.println();

		Set set = new HashSet();
		set.add("순서");
		set.add("유지");
		set.add("테스트");
		set.add("과연");
		set.add("결과는");

		it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		System.out.println();

		Set set2 = new HashSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);

		it = set2.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
