public class ArrayExam5 {
	public static void main(String[] args) {
		int[][] arr1 = new int[][] {
			{ 1, 2, 3 },
			{ 4, 5, 6 ,66,64,12},
			{ 7, 8, 9 },
			{ 10, 11, 12 }
			
		};
		for(int i = 0; i < arr1.length; i++ ) {
		//	int[] arr2 = arr1[i];  //첫번째 대괄호에 배열 i를 만약 arr1[1] 이면 arr2는 {1,2,3}
		//Q줄여서 사용 
		//int value = arr1[i][1]; //일일히 사용하는 하드코딩
			for(int j =0; j< arr1[i].length; j++) { //다차원 배열이기에 arr1 '[i]' 를 추가
				System.out.println(arr1[i][j]); //[i]는 행 ,[j]는 열을 의미.
				//자료형이 열의개수가 모두 같은 값이 아니어도 length로 써서 상관 없음.
			}
		}
		
	}
	
}