package Example;

class Replace {
	public static void main(String args[]) {
		String str = "Lorem ipsum dolor sit amet,";
		//Q.���⸶�� \�� �ִ´�
		String s = str.replace(" ", "\\"); 
		System.out.println(s);
		System.out.println(str); //��ȭ�� �ִ��� ������ �״����
	}
}
