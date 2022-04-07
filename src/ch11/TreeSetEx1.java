package ch11;

import java.util.TreeSet;

class TreeSetEx1 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();

		String from = "b";
		String to	= "d";

		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");

		System.out.println(set);
		System.out.println("range search : from " + from  +" to "+ to);
		//subSet: 범위 검색, 시작범위~끝범위-1
		System.out.println("result1 : " + set.subSet(from, to)); // b ~ c 까지만 출력 (대문자는 출력x)
		System.out.println("result2 : " + set.subSet(from, to + "zzz")); // b ~ d 까지 출력 (대문자는 출력x)
	}
}
