import java.io.IOException;
import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) throws IOException {
		// 1번방법
		int input = System.in.read();
		char ch = (char) input;

		System.out.println("입력된 문자 : " + ch);
		char ch2 = ch >= 'A' && ch <= 'Z' ? (char) (ch + 32) : ch;
		System.out.println("변환된 문자 : " + ch2);

		/////////////////////////////////////////////////

		// 2번방법
		Scanner s = new Scanner(System.in);
		String in = s.nextLine();
		char ch3 = in.charAt(0);
		// 입력된 한글자만 chr로 변환
		/////////////////////////////////////////////////

	}
}