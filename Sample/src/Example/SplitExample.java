package Example;

public class SplitExample {
	public static void main(String[] args) {
		String str = "���ع��� ��λ��� ������ �⵵�� �ϴ����� �����ϻ� �츮���� ����";
		String[] arr = str.split(" "); // arr�̶�� ������ split���� ����//���鸶�� �迭�� �ٲ�
		String temp = ""; // ���� temp �ʱ�ȭ
		// for
		for (int i = 0; i < arr.length; i++) {
			temp += arr[i] + "^"; //������ �־�� ��°���
			System.out.println(temp);
		}
		///////////for - each����
		String temp2 = "";
		for (String string : arr) {
			temp2 += string + " ";
			System.out.println(temp2);
		}
	}
}
