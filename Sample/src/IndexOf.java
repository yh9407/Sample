class IndexOf {
	public static void main(String args[]) {
		String str = "Java ������ �缺�� ���� ����������!!";
		int idx = -1;
		int count = 0;
		while (true) {
			idx = str.indexOf(" ", idx + 1); // idx���� -1 ���� �����̴ϱ� +1 �ϸ� 0���� ����
			count++;
			if (idx == -1) {
				break;
			}
			System.out.println(count);
		}

//		int idx = str.indexOf(" "); //������ ��ġ�� int������ ǥ��
//		System.out.println(idx);
//		
//		idx = str.indexOf(" " , idx + 1); //������ ã�� idx �������� �ٽ� ������ ã��
//		System.out.println(idx); //���̻� ã�������� ���ٸ� -1 ���

	}
}