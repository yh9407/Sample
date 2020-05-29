import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		System.out.println("값 입력 ");
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
				
		boolean result = n >0 ;
		String result1 = result ==true ? "양수" :"음수";
		
		System.out.println( result1 ); // 삼항 연산자
		 
		
		
		
	
	}
}