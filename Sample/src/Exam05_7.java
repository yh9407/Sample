//Q2.
public class Exam05_7 {
	public static void main(String[] args) {
		char[] text = { 'g', ' ', 'f', 'm', 'n', 'c', ' ', 'w', 'm', 's', ' ', 'b', 'g', 'b', 'l', 'r', ' ', 'r', 'p',
				'_', 'l', 'q', 'j', '_', 'r', 'c', ' ', 'g', 'r', ' ', '`', 'w', ' ', 'f', '_', 'l', 'b' };

		for (int i = 0; i < text.length; i++) {
			if(text[i] != ' ') {
			char a = (char)(text[i] + 2);
			System.out.print(a);
			}else {
				System.out.print(" ");
			}		
		}
	}
}