package Example;

public class StarArt2 {
	public static void main(String[] args) {
		int n =7;
		int center = n / 2 + 1;
		int left = center;
		int right = center;
		for (int i = 1; i <= n; i++) { // 행 
			for (int j = 1; j <=n; j++) { //열        7*7 
				if (j < left || j > right) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			if (i < center) { // i가 가운데값일때 반대로 //center 행부터
				left--;//중앙부터 아래 part
				right++;
			} else { //중앙부터 위
				left++;
				right--;
			}
			System.out.println();
		}
	}
}