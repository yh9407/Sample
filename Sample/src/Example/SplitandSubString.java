package Example;

public class SplitandSubString {
	public static void main(String[] args) {
		String file = "/home/temp/java.class";

		// 1. Split
		String[] arr = file.split("/");// /마다 배열로
		for (String string : arr) {// 4다음 공백을 없애기위해
			if (string.equals("") != true) {
				System.out.println("/" + string);
			}
		}
		int idx = 0;// 시작 위치
		int end_idx = 0; // 마지막 위치
		// 2.Substring ( +IndexOf)
		while (true) {
			end_idx = file.indexOf("/", idx); // 첫번째 /찾고,그다음 /찾고
			// 세번째/찾을때 처음 찾은/ 정보는 사라짐(변수를 각각지정해야됨)//end_idx에 찾는 위치를 다시 시작위치로 넣음
			// 한번 찾고 이동하고, 다시 찾고 다시 이동하고

			// 더이상 /를 찾지 못할때 (idx==-1이 되는경우)
			if (end_idx == -1)
				{
				System.out.println(file.substring(idx));//java.class라는 마지막 문자열 출력을 위해서
				break;
				}
			System.out.println(file.substring(idx, end_idx));
			idx = end_idx;
			idx++;
		}
	}
}
