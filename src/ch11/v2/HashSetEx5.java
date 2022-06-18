package ch11.v2;

import java.util.HashSet;
import java.util.Iterator;

class HashSetEx5 {
	public static void main(String args[]) {
		HashSet setA    = new HashSet();
		HashSet setB    = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();

		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		System.out.println("A = "+setA);

		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		System.out.println("B = "+setB);

		// 교집합 - setA.retainAll(setB)
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setA.contains(tmp)) { // A에서 B에도 있는 것만 저장
				setKyo.add(tmp);
			}
		}

		// 차집합 - setA.removeAll(setB)
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp)) { //B에 없는 것만 저장
				setCha.add(tmp);
			}
		}

		// 합집합 - setA.addAll(setB)
		it = setA.iterator();
		while(it.hasNext()) {
			setHab.add(it.next());
		}

		it = setB.iterator();
		while(it.hasNext()) {
			setHab.add(it.next()); //중복은 제거되고 저장
		}

		System.out.println("A 교 B = "+setKyo);
		System.out.println("A 합 B = "+setHab);
		System.out.println("A 차 B = "+setCha);
	}
}
