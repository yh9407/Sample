//�������� ���� ���
public class ��ġ�ٲٱ�Exam3 {
	public static void main(String[] args) {
		char[] c = { 'b', 'e', 'z', 'a', 'w' };
		for (int i = 0; i < 100; i++) {
			int a = c[0];
			int ran = (int) (Math.random() * c.length); //��ü�� ��ȣ�� ������ int�� ��ȯ
			int b = c[ran];
			int temp = a;
			a = b;
			b = temp;
			c[0] = (char) a; // a��� ������ 0��°��
			c[ran] = (char) b; // b��� ������ ran��°��

		}
		System.out.println(c);

	}
}