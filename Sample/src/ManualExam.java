import java.util.Scanner;

public class ManualExam {
	public static void main(String[] args) {
		// ���ѹݺ� ����
		boolean isRun = true; //1�� ȣ��,2��ȣ�� ��� ���α׷��� ���ƾ���.
		// �л� ��
		int studentNum = 0; 
		// �л��� ����
		int[] scores = null; //�迭�� ������ ����������.[ ]
		Scanner scan = new Scanner(System.in);
		while (isRun) {
			System.out.println("======================================");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("======================================");
			System.out.print("���� > ");

			int selectNo = scan.nextInt(); //�Է¹��� �� ���� ������ .

			if (selectNo == 1) {
				System.out.println("�л��� �Է�> ");
				studentNum = scan.nextInt(); //������ ������ ������ �߿�. �� �������� while���� ������ ��ġ
				scores = new int[studentNum]; //�迭�� ����. -> scores�� �ִ´�

			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length ; i++) {
					System.out.print("scores[" + i + "]> ");

					scores[i] = scan.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%s] >%s\n", i , + scores[i]);
				}

			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for (int i = 0; i < scores.length; i++) {
					max = (max < scores[i]) ? scores[i] : max; 
					//scores[i]�� max���� ũ�ٸ� scores[i]�� ��� , �ƴϸ� max �ٽ� max
					
					sum += scores[i];
				}
				avg = (double) sum / studentNum;
				System.out.println("�ְ� ����  : " + max);
				System.out.println("��� ����  : " + avg);

			} else if (selectNo == 5) {
				isRun = false;
			}
		}
		scan.close();
		System.out.println("���α׷� ����");
	}
}
