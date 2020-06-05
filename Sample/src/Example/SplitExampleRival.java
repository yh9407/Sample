package Example;
//반대로 출력
public class SplitExampleRival {
	public static void main(String[] args) {
		String str = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		String[] arr = str.split(" "); // arr이라는 변수에 split으로 담음

		String temp = "";
		for (int i = arr.length - 1; i >= 0; i--) { //길이에 -1안하면 바로 멈춤 0부터 세니까
			temp += arr[i] + " ";
			System.out.println(temp);
		}

	}
}
