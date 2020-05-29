public class Example9 {

	public static void main(String[] args) {
		
		int score = 12;
		
		if(score%2 ==0 && score%3 ==0) {
			System.out.println("ÄôÂ¦");
		}else if (score%3 ==0) {
			System.out.println("Â¦");
		}else if (score%2 ==0) {
			System.out.println("Äô");
					
		}
		else {
			System.out.println("²Î");
		}
	}
}