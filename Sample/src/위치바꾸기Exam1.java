//�ּڰ� ���ϱ� 
public class ��ġ�ٲٱ�Exam1 {
	public static void main(String[] args) {
		//�ִ밪�� ���Ϸ��� min���� ���� ���� ���� , i < num.length�� �ε�ȣ�� �ݴ�� ����
		int[] num = { 3, 2, 1, 7, 4 };
		int min = Integer.MAX_VALUE; // �ӽð��� ���� ����
		// Integer.MAX_~ : int���� ���� ū���� �־��� , 0�� ������ ����Ʈ�� �ּڰ��� 0�� ���
		
		for (int i = 0; i < num.length; i++) {    
			int n = num[i];
			// n�� num�ȿ� �ִ� ������ i��°�� ��� ����
			if (n < min) { // ���� n�� min���� �۴ٸ�, n�� min�� ���� �־��.
				min = n;
			}
		}
		System.out.println("�ּڰ��� = " + min); //for�� �ۿ� print���� �������
	}
}
