import java.util.Calendar;

// �޷¸����
// �޷� ���Ŀ� �°� ��� (for, %)
public class CalendarExam {
	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();

		//���� ���� 1�Ϸ� ����
		c.set(Calendar.DATE, 1);
		
		
		int startDayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("SU MO TU WE TH FR SA");
		for(int i = 1; i < startDayOfWeek; i++ ) {
			System.out.println("  ");
		}
		
		int year = c.get(Calendar.YEAR);

		System.out.println(year);
		// ���� ������ -1 �� ���� ���
		// 1���� 0���̶�� ���
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println(month);

		// int date = c.get(Calendar.DATE);
		// System.out.println(date);
		// ������ ��¥ (���� 5��)
		int max = c.getMaximum(Calendar.DATE);
		for (int i = 1; i <= max; i++) {
			// ��� ���ڸ� ���
			System.out.print(" " + (i <10 ? " "+i : i)  );  //���׿����ڸ� ����, ��ȣ�� ������
			                           //i�� 10���� �۴ٸ�, " "�� �߰��ϰ�, �׷��� ������, �׳� i�� ���
			if(i % 7 ==0 ) {
				System.out.println();
			}
			
			
		}
	}
}
