import java.util.Scanner;

public class Example3 {
//���� �ڸ��� ���� �ڸ� ���ڰ� ���� ������ True : False 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
			System.out.print("2�ڸ��� ���� �Է�(10~99)>>" );
			int n = scanner.nextInt();
			
			int ten = n / 10;
			int one = n % 10;
			System.out.println(ten == one);
		
		 
		
		
	
	}
}