package Example;

import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
		int[] lotto = { 3, 4, 34, 42, 21, 16 };
		int count = 0;

		// 로또 구매
		while (true) { // 맞출때 까지 구매한다, 무한반복
			int[] my = new int[6];
			// 로또번호 6개 (1장 구매 ) 
			for (int i = 0; i < 6; i++) {
				int num = (int) (Math.random() * 45 + 1); // 0~ 44 까지 수니까 + 1 추가.
				my[i] = num;
			}
			//오름차순 정렬// java에서 제공한 library이용
			Arrays.sort(my);  			
			//그동안 구매한 번호를 출력
			System.out.println(Arrays.toString(my));
			count++;
			System.out.println( "구매횟수 : " + count);
			//번호 비교
			boolean result = Arrays.equals(lotto,my);
			if(result) { //1등당첨
				System.out.println(Arrays.toString(my));
				break;
			}
		}
		
	}

}
