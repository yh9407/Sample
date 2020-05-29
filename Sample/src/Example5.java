import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		int num = 10;
		boolean result = num >0 ;
		String result1 = result ==true ? "양수" :"음수";
		
		String r = num > 0 ? "양수" : "음수" ; 
		System.out.println(r);
		System.out.println(num > 0 ? "양수" : "음수");		
		System.out.println( result1 ); // 삼항 연산자
		 
		
		
	
	}
}