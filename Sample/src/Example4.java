public class Example4 {

	public static void main(String[] args) {
		int num = 123456;
		int total = 0;

		for (int i = 1; i <= 6; i++) {
			total = total + num % 10; //실행식들 5번 반복
			num = num / 10;           //      
		}
		
//		total = total + num % 10 ;
//		num = num / 10 ;
//		total = total + num % 10 ;
//		num = num / 10 ;
//		total = total + num % 10 ;
//		num = num / 10 ;
//		total = total + num % 10 ;
//		num = num / 10 ;

//	    int result = num/10000 + num%10000/1000 + num%10000%1000/100
//			+num%10000%1000%100/10 + num%10000%1000%100%10;

		System.out.println("각 자리 숫자의 합 : " + total);
//System.out.println("각 자리 숫자의 합 : " + result);

	}
}