
public class 위치바꾸기 {
	public static void main(String[] args) {
		int a = 10;
		int b = 100;
		int temp = 0;
		System.out.printf("%s %s", a, b);
		System.out.println();
		// 임시공간 temp라는 변수 생성
		// Q. 왜 0이라는 값을 넣을까? , 변수는 사용전에 항상 값을 초기화 해야함. 꼭 0이 아니어도 상관은 없음.
		temp = a; // a를 temp라는 임시공간에 넣어두고
		a = b; // b를 a에 덮어씀
		b = temp;//이제 temp에 있는 a를 b에 넣음.
		System.out.printf("%s %s", a, b);

	}

}
