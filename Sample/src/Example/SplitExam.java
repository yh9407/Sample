package Example;

public class SplitExam {
	public static void main(String[] args) {

		String str = "Java Secure Coding";
		String[] strs = str.split(" ");
		//for-each
		for (String s : strs) { //��ü��ο� ��ȭ�� �ٶ� ��������, �ε����� ����Ұ�(Ư������)
			System.out.println(s);
		}
	}
}
