public class �ֻ������� {
	public static void main(String[] args) {

		boolean isContinue = true;
		int count = 0;
		while (isContinue) {
			int num1 = (int) (Math.random() * 6 + 1);
			int num2 = (int) (Math.random() * 6 + 1);

			count++; // ���� Ƚ�� ���� �ѹ� �������� 1�� ����.

			System.out.printf("(%s,%s)\n", num1, num2);

			if (num1 == num2) {
				isContinue = false;

			}
		}
		System.out.println();
		System.out.println("�ֻ����� ���� Ƚ�� : " + count);

	}
}
