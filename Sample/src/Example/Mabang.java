package Example;

//����� ���� ������ 
public class Mabang {

	public static void main(String[] args) {
		int n = 5;
		int[][] mabang = new int[n][n]; // 5*5 ���
		// x : ������, y : ������
		// ù ��ǥ��
		int x = 0;
		int y = n / 2;
		mabang[x][y] = 1; // 1���ͽ���
		for (int i = 2; i <= n * n; i++) {
			// ���� ���ڸ� ���� ��ǥ (���� �밢��)
			x = x - 1;
			y = y - 1; // 11�ù������� �̵� (��/�� �Ѵ� -1;)

			if (x < 0) { // �������� �����϶�
				if (y < 0) {// ������ �����϶� //Ex>15 //���� ����
					x += 2;
					y += 1;
				} else {
					x = n - 1; // ���� �Ʒ��� ����
				}
				// �������� ������ ũ�� ���� ������ ��ǥ�� ����
				// ������ ������ �����϶�
			} else {
				if (y < 0) {
					y = n - 1;
				} else {
					// �� �����ε� ���ڰ� �ԷµǾ��ִ� ��� //���� �ܰ��ΰ��� ����
					if (mabang[x][y] != 0) {
						x += 2;
						y += 1;
					}
				}
			}
			mabang[x][y] = i; // ���� x�� y ��ǥ�� ���� ���� ���� �Է�
		}
		for (int i = 0; i < mabang.length; i++) {
			for (int j = 0; j < mabang[i].length; j++) {
				System.out.print(mabang[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
