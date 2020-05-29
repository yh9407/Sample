public class Example04_4_2 {
	public static void main(String[] args) {

		int total = 0; //선언의 위치가 반복문 밖에서

		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0 && i % 7 == 0) {
				System.out.println(i);
				total = total + i;
			}

		}
		System.out.println("총합 = " + total);
	}
}