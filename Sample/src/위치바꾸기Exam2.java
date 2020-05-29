//글자정렬 [선택정렬,변수하나를 잡고 모든 변수와 비교하면서 위치옮김]
public class 위치바꾸기Exam2 {
	public static void main(String[] args) {
		char[] c = { 'b', 'e', 'z', 'a', 'w' };
		char temp = ' ';
		for (int i = 0; i < c.length - 1; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) { // 부등호 방향에 따라 오름차순, 내림차순 정리
					temp = c[i];// 만약 i번째가 j번째보다 크다면, i번째를 temp에 넣고
					c[i] = c[j];// j번째를 i번째에 넣고
					c[j] = temp;// temp에 있던 i번째였던 것을 j번째로 옮김
				}
			}
		}
		System.out.println(c);
	}
}