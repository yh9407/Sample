import java.io.IOException;
import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) throws IOException {
		// 1�����
		int input = System.in.read();
		char ch = (char) input;

		System.out.println("�Էµ� ���� : " + ch);
		char ch2 = ch >= 'A' && ch <= 'Z' ? (char) (ch + 32) : ch;
		System.out.println("��ȯ�� ���� : " + ch2);

		/////////////////////////////////////////////////

		// 2�����
		Scanner s = new Scanner(System.in);
		String in = s.nextLine();
		char ch3 = in.charAt(0);
		// �Էµ� �ѱ��ڸ� chr�� ��ȯ
		/////////////////////////////////////////////////

	}
}