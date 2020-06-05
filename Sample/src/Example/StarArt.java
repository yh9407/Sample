package Example;

public class StarArt {
	public static void main(String[] args) {
		int center = 10 / 2 + 1;

		for (int i = 0; i <= center; i++) {// yÃà

			for (int j = 0; j <= center - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = center -1; i >= 0; i--) {
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