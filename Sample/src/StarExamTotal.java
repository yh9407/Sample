public class StarExamTotal {
	public static void main(String[] args) {
//행하나, 열하나 반복문 하나씩 
		int space = 0;
		for (int y = 1; y <= 5; y++) {
			space = 5 - y;
			for (int x = 1; x <= 5; x++) {
				if (space >= x) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			
		}		
		for(int a =1 ; a<= 5; a++ ) {
			space = a-1;
			for (int b =1; b <=5; b++) {
				if (space >= b) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
