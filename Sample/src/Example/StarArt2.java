package Example;

public class StarArt2 {
	public static void main(String[] args) {
		int n =7;
		int center = n / 2 + 1;
		int left = center;
		int right = center;
		for (int i = 1; i <= n; i++) { // �� 
			for (int j = 1; j <=n; j++) { //��        7*7 
				if (j < left || j > right) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			if (i < center) { // i�� ������϶� �ݴ�� //center �����
				left--;//�߾Ӻ��� �Ʒ� part
				right++;
			} else { //�߾Ӻ��� ��
				left++;
				right--;
			}
			System.out.println();
		}
	}
}