package Example;

import java.util.Calendar;

public class Dday {
	public static void main(String[] args) {
		// Q.���÷κ��� 100�� �ڰ� �������� �˰�ʹٸ�.
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE,1000);//���� ��,��,���� ���� ,�ڴ� amount
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1; //0������ 11������ ��� +1�� �ʿ�
		int date = c.get(Calendar.DATE);
		System.out.println(year + "�� " + 
		(month <10 ? "0" + month : month) + "�� " +
		(date < 10 ? "0" + date :date) + "��") ; //���׿����ڷ� ���ڸ� ��,�Ͽ� �տ� "0"�߰�
	}
}
