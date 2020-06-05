package Example;

public class SplitExam {
	public static void main(String[] args) {

		String str = "Java Secure Coding";
		String[] strs = str.split(" ");
		//for-each
		for (String s : strs) { //전체모두에 변화를 줄땐 괜찮지만, 인덱스는 적용불가(특정구간)
			System.out.println(s);
		}
	}
}
