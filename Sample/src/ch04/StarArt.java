package ch04;

public class StarArt {
	public static void main(String[] args) {
		int center = 9 / 2 + 1;

		for (int i = 0; i <= center; i++) {// y��

			for (int j = 0; j <= center - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j <= center - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}