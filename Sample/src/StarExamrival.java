public class StarExamrival {
	public static void main(String[] args) {
//ตฺมýศ๙ วüลย
		int space = 0;
		for (int y = 1; y <= 6; y++) {
			space = y-1;
			for (int x = 1; x <= 6; x++) {
				if (space >= x) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}