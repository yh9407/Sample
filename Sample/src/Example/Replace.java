package Example;

class Replace {
	public static void main(String args[]) {
		String str = "Lorem ipsum dolor sit amet,";
		//Q.띄어쓰기마다 \를 넣는다
		String s = str.replace(" ", "\\"); 
		System.out.println(s);
		System.out.println(str); //변화를 주더라도 원본은 그대로임
	}
}
