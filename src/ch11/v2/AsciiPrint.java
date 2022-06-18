package ch11.v2;

class AsciiPrint {
	public static void main(String[] args) {
		// 문자열 정렬 기준 - 문자의 아스키코드 값
		// 공백 -> 숫자 -> 대문자 -> 소문자
		char ch = ' ';
		for(int i=0; i < 95; i++) {
			System.out.print(ch++);
		}
	}
}
