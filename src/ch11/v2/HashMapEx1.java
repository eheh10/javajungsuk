package ch11.v2;

import java.util.HashMap;
import java.util.Scanner;

class HashMapEx1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put(null, null); //null 허용
		map.put("asdf", "1234"); //키 중복 -> 기존의 값 덮어씌움

		map.put(null,null);
		System.out.println(map.get(null)); //null 허용

		Scanner s = new Scanner(System.in);

		while(true) {
			System.out.println("id, password 입력");
			System.out.print("id:");
			String id = s.nextLine().trim();

			System.out.print("password:");
			String password = s.nextLine().trim();
			System.out.println();

			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			} else {
				if(!(map.get(id)).equals(password)) {
					System.out.println("비밀번호 불일치. 다시 입력해주세요.");
				}else {
					System.out.println("id, 비밀번호 일치");
					break;
				}
			}
		}
	}
}
