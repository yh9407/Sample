package ch04;

public class Ex {
	public static void main(String[] args) {
		String str = "Java Secure Coding";
		int len = str.length(); //���ڿ��� ���̰� 
		for (int i = 0; i < len; i++) { 
			char c = str.charAt(i); //�ݺ��� ,0������ ������ length���̸�ŭ
			System.out.print(c);
			//���� �ϳ��� ���ε��� ���� ��.
		}
	}
}
