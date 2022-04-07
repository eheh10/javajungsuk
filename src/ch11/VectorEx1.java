package ch11;

import java.util.Vector;

class VectorEx1 {
	public static void main(String[] args) {
		Vector v = new Vector(5); //용량 지정

		System.out.println("=== Vector v init status ===");
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);

		v.trimToSize(); //빈 공간 없애기 -> 용량==크기 => 새로운 배열 생성
		System.out.println("=== After trimToSize() ===");
		print(v);

		v.ensureCapacity(6); //최소 크기 설정 => 새로운 배열 생성 (이미 최소 크기 이상이라면 아무일x)
		System.out.println("=== After ensureCapacity(6) ===");
		print(v);

		v.setSize(7); //크기 설정 => 새로운 배열 생성 (이미 크기 이상이라면 아무일x)
		System.out.println("=== After setSize(7) ===");
		print(v);
		
		v.clear(); //비우기
		System.out.println("=== After clear() ===");
		print(v);
	}

	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size :" + v.size()); //크기 - 값이 있는 크기
		System.out.println("capacity :" + v.capacity()); //용량 - 값을 넣을 수 있는 크기
		System.out.println();
	}
}
