//�������� [��������,�����ϳ��� ��� ��� ������ ���ϸ鼭 ��ġ�ű�]
public class ��ġ�ٲٱ�Exam2 {
	public static void main(String[] args) {
		char[] c = { 'b', 'e', 'z', 'a', 'w' };
		char temp = ' ';
		for (int i = 0; i < c.length - 1; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) { // �ε�ȣ ���⿡ ���� ��������, �������� ����
					temp = c[i];// ���� i��°�� j��°���� ũ�ٸ�, i��°�� temp�� �ְ�
					c[i] = c[j];// j��°�� i��°�� �ְ�
					c[j] = temp;// temp�� �ִ� i��°���� ���� j��°�� �ű�
				}
			}
		}
		System.out.println(c);
	}
}