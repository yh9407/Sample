import java.io.IOException;

public class Example6 {

	public static void main(String[] args) throws IOException {
		int input = System.in.read();
		char ch = (char) input;

		System.out.println("입력된 문자 : " + ch);
		char ch2 = ch >= 'A' && ch <= 'Z' ? (char) (ch + 32) : ch;

		System.out.println("변환된 문자 : " + ch2);

	}
}