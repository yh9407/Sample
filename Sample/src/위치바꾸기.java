
public class ��ġ�ٲٱ� {
	public static void main(String[] args) {
		int a = 10;
		int b = 100;
		int temp = 0;
		System.out.printf("%s %s", a, b);
		System.out.println();
		// �ӽð��� temp��� ���� ����
		// Q. �� 0�̶�� ���� ������? , ������ ������� �׻� ���� �ʱ�ȭ �ؾ���. �� 0�� �ƴϾ ����� ����.
		temp = a; // a�� temp��� �ӽð����� �־�ΰ�
		a = b; // b�� a�� ���
		b = temp;//���� temp�� �ִ� a�� b�� ����.
		System.out.printf("%s %s", a, b);

	}

}
