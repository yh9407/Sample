import java.util.Scanner;

public class Example3 {
//십의 자리와 일의 자리 숫자가 서로 같으면 True : False 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
			System.out.print("2자리수 정수 입력(10~99)>>" );
			int n = scanner.nextInt();
			
			int ten = n / 10;
			int one = n % 10;
			System.out.println(ten == one);
		
		 
		
		
	
	}
}