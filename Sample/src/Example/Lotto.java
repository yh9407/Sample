package Example;

import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
		int[] lotto = { 3, 4, 34, 42, 21, 16 };
		int count = 0;

		// �ζ� ����
		while (true) { // ���⶧ ���� �����Ѵ�, ���ѹݺ�
			int[] my = new int[6];
			// �ζǹ�ȣ 6�� (1�� ���� ) 
			for (int i = 0; i < 6; i++) {
				int num = (int) (Math.random() * 45 + 1); // 0~ 44 ���� ���ϱ� + 1 �߰�.
				my[i] = num;
			}
			//�������� ����// java���� ������ library�̿�
			Arrays.sort(my);  			
			//�׵��� ������ ��ȣ�� ���
			System.out.println(Arrays.toString(my));
			count++;
			System.out.println( "����Ƚ�� : " + count);
			//��ȣ ��
			boolean result = Arrays.equals(lotto,my);
			if(result) { //1���÷
				System.out.println(Arrays.toString(my));
				break;
			}
		}
		
	}

}
