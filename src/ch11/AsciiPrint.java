package ch11;

class AsciiPrint{
	public static void main(String[] args) {
		// 문자열의 정렬 기준 - 문자의 유니코드 값
		// 공백 -> 숫자 -> 대문자 -> 소문자

		char ch = ' ';
		for(int i=0; i < 95; i++) {
			System.out.print(ch++);
		}
	}
}
