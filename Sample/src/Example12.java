import java.util.Scanner;

public class Example12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� 3�� �Է�>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if (a > b && a < c || a == b) {
			System.out.println("�߰����� " + a);
		} else if (a < b && b < c || b == c) {
			System.out.println("�߰����� " + b);
		} else {
			System.out.println("�߰����� " + c);
		}

	}

}
