import java.io.IOException;

public class Example6 {

	public static void main(String[] args) throws IOException {
		int input = System.in.read();
		char ch = (char) input;

		System.out.println("�Էµ� ���� : " + ch);
		char ch2 = ch >= 'A' && ch <= 'Z' ? (char) (ch + 32) : ch;

		System.out.println("��ȯ�� ���� : " + ch2);

	}
}