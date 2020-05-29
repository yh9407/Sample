public class 주사위게임 {
	public static void main(String[] args) {

		boolean isContinue = true;
		int count = 0;
		while (isContinue) {
			int num1 = (int) (Math.random() * 6 + 1);
			int num2 = (int) (Math.random() * 6 + 1);

			count++; // 던진 횟수 증가 한번 돌때마다 1씩 증가.

			System.out.printf("(%s,%s)\n", num1, num2);

			if (num1 == num2) {
				isContinue = false;

			}
		}
		System.out.println();
		System.out.println("주사위를 던진 횟수 : " + count);

	}
}
