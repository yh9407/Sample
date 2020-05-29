class IndexOf {
	public static void main(String args[]) {
		String str = "Java 개발자 양성을 통한 취업연계과정!!";
		int idx = -1;
		int count = 0;
		while (true) {
			idx = str.indexOf(" ", idx + 1); // idx값이 -1 부터 시작이니까 +1 하면 0부터 시작
			count++;
			if (idx == -1) {
				break;
			}
			System.out.println(count);
		}

//		int idx = str.indexOf(" "); //공백의 위치를 int값으로 표현
//		System.out.println(idx);
//		
//		idx = str.indexOf(" " , idx + 1); //위에서 찾은 idx 다음부터 다시 공백을 찾음
//		System.out.println(idx); //더이상 찾을내용이 없다면 -1 출력

	}
}