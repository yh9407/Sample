package Example;
//�ݴ�� ���
public class SplitExampleRival {
	public static void main(String[] args) {
		String str = "���ع��� ��λ��� ������ �⵵�� �ϴ����� �����ϻ� �츮���� ����";
		String[] arr = str.split(" "); // arr�̶�� ������ split���� ����

		String temp = "";
		for (int i = arr.length - 1; i >= 0; i--) { //���̿� -1���ϸ� �ٷ� ���� 0���� ���ϱ�
			temp += arr[i] + " ";
			System.out.println(temp);
		}

	}
}
