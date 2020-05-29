package ch04;

public class Ex {
	public static void main(String[] args) {
		String str = "Java Secure Coding";
		int len = str.length(); //문자열의 길이값 
		for (int i = 0; i < len; i++) { 
			char c = str.charAt(i); //반복문 ,0번부터 마지막 length길이만큼
			System.out.print(c);
			//문자 하나씩 따로따로 비교한 것.
		}
	}
}
