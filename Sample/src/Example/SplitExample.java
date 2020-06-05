package Example;

public class SplitExample {
	public static void main(String[] args) {
		String str = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		String[] arr = str.split(" "); // arr이라는 변수에 split으로 담음//공백마다 배열로 바꿈
		String temp = ""; // 변수 temp 초기화
		// for
		for (int i = 0; i < arr.length; i++) {
			temp += arr[i] + "^"; //변수에 넣어야 출력가능
			System.out.println(temp);
		}
		///////////for - each구문
		String temp2 = "";
		for (String string : arr) {
			temp2 += string + " ";
			System.out.println(temp2);
		}
	}
}
