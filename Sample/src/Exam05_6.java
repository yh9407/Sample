//Q2.
public class Exam05_6 {
	public static void main(String[] args) {
		char[] text = { 'g', ' ', 'f', 'm', 'n', 'c', ' ', 'w', 'm', 's', ' ', 'b', 'g', 'b', 'l', 'r', ' ', 'r', 'p',
				'_', 'l', 'q', 'j', '_', 'r', 'c', ' ', 'g', 'r', ' ', '`', 'w', ' ', 'f', '_', 'l', 'b' };

		for (int i = 0; i < text.length; i++) {
			if (text[i] != ' ') {
				int a = (int) (text[i] + 2);

				System.out.print((char) a);
			} else {
				System.out.print(" ");
			}

			// 코드 작성 – 아스키코드 상의 10진수를 2 증가시킨 후 출력
		}
	}
}