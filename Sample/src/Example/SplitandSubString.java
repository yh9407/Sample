package Example;

public class SplitandSubString {
	public static void main(String[] args) {
		String file = "/home/temp/java.class";

		// 1. Split
		String[] arr = file.split("/");// /���� �迭��
		for (String string : arr) {// 4���� ������ ���ֱ�����
			if (string.equals("") != true) {
				System.out.println("/" + string);
			}
		}
		int idx = 0;// ���� ��ġ
		int end_idx = 0; // ������ ��ġ
		// 2.Substring ( +IndexOf)
		while (true) {
			end_idx = file.indexOf("/", idx); // ù��° /ã��,�״��� /ã��
			// ����°/ã���� ó�� ã��/ ������ �����(������ ���������ؾߵ�)//end_idx�� ã�� ��ġ�� �ٽ� ������ġ�� ����
			// �ѹ� ã�� �̵��ϰ�, �ٽ� ã�� �ٽ� �̵��ϰ�

			// ���̻� /�� ã�� ���Ҷ� (idx==-1�� �Ǵ°��)
			if (end_idx == -1)
				{
				System.out.println(file.substring(idx));//java.class��� ������ ���ڿ� ����� ���ؼ�
				break;
				}
			System.out.println(file.substring(idx, end_idx));
			idx = end_idx;
			idx++;
		}
	}
}
