
public class Exams05_6 {
	public static void main(String[] args) {
		double[][] arr = { { 95.4, 86.3 }, { 83.2, 92.1, 96.6 },{ 78.3, 83, 93, 87, 88 } };
		double sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for (int i =0; i < arr.length; i++) { //행
			for(int j=0; j < arr[i].length; j++) { //열
				count ++;
				sum += arr[i][j];
				avg = (double) (sum / count) ; 
			}
		}
		
		// 코드 작성
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
