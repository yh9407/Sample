//Q1.�հ� ����� ���ϵ� '0'���� ���� �Ѵ�. 
public class Exam05_2 {
	public static void main(String[] args) {

		int[] arr = { 10, 0, 12, 0, 15, 0, 16, 0, 18, 0 };
		int sum = 0; 
		int count = 0; // ���� ���� ��� ��������
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				sum = sum + arr[i];
				count++; //0�� �ƴ� ���� ������������ count���� �ϳ��� ����.
			} else {
				
			}
		}
		System.out.println("������ = " + sum);
		System.out.println("����� = " + sum /(double)count);
	}
}