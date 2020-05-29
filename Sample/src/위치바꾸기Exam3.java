//랜덤으로 섞는 방법
public class 위치바꾸기Exam3 {
	public static void main(String[] args) {
		char[] c = { 'b', 'e', 'z', 'a', 'w' };
		for (int i = 0; i < 100; i++) {
			int a = c[0];
			int ran = (int) (Math.random() * c.length); //전체를 괄호로 묶에서 int로 변환
			int b = c[ran];
			int temp = a;
			a = b;
			b = temp;
			c[0] = (char) a; // a라는 변수를 0번째에
			c[ran] = (char) b; // b라는 변수를 ran번째에

		}
		System.out.println(c);

	}
}