public class Example10 {

	public static void main(String[] args) {
		int year = 2000; // ����
		if (year % 4 == 0 && year % 100 == 0 && year % 400 != 0) {
			System.out.println("����Դϴ�.");
		} else if (year % 4 == 0  || year % 400 == 0) {
			System.out.println("�����Դϴ�.");

		}

		else {
			System.out.println("����Դϴ�.");
		}
	}
}
