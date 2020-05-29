//최솟값 구하기 
public class 위치바꾸기Exam1 {
	public static void main(String[] args) {
		//최대값을 구하려면 min값은 아주 작은 수로 , i < num.length의 부등호를 반대로 적용
		int[] num = { 3, 2, 1, 7, 4 };
		int min = Integer.MAX_VALUE; // 임시공간 변수 생성
		// Integer.MAX_~ : int값중 가장 큰값을 넣어줌 , 0을 넣으면 프린트로 최솟값인 0을 출력
		
		for (int i = 0; i < num.length; i++) {    
			int n = num[i];
			// n은 num안에 있는 변수는 i번째다 라고 정의
			if (n < min) { // 만약 n이 min보다 작다면, n을 min에 집어 넣어라.
				min = n;
			}
		}
		System.out.println("최솟값은 = " + min); //for문 밖에 print문을 적어야함
	}
}
