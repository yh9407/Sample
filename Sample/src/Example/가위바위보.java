package Example;

public class ���������� {
	public static void main(String[] args) {
		// ����
		// 0.0 <= X < 1.0 ���̰� ���� //1�� ������ ����
		// ���� = 0 , ���� = 1 , �� = 2
		double ran = Math.random();
int com = (int)(ran * 3); //(int)�� �Ҽ����� ��� �Ұ�
		System.out.println(ran);
		System.out.println(com);
		int player = 2 ;
		
		if(player == com) {
			System.out.println("�����");
		}else if((player + 1) % 3 == com) { //3�� ���� �� �����ϱ�  %3   
			System.out.println("�÷��̾� ��");
		}else { 
			System.out.println("�÷��̾� ��");
		}
		
		
		
	}

}
