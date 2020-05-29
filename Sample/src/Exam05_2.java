//Q1.합과 평균을 구하되 '0'점은 제외 한다. 
public class Exam05_2 {
	public static void main(String[] args) {

		int[] arr = { 10, 0, 12, 0, 15, 0, 16, 0, 18, 0 };
		int sum = 0; 
		int count = 0; // 값의 개수 라는 변수생성
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				sum = sum + arr[i];
				count++; //0이 아닌 값이 더해질때마다 count값이 하나씩 증가.
			} else {
				
			}
		}
		System.out.println("총합은 = " + sum);
		System.out.println("평균은 = " + sum /(double)count);
	}
}