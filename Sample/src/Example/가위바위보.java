package Example;

public class 가위바위보 {
	public static void main(String[] args) {
		// 난수
		// 0.0 <= X < 1.0 사이값 나옴 //1은 나오지 않음
		// 가위 = 0 , 바위 = 1 , 보 = 2
		double ran = Math.random();
int com = (int)(ran * 3); //(int)로 소수점을 모두 소거
		System.out.println(ran);
		System.out.println(com);
		int player = 2 ;
		
		if(player == com) {
			System.out.println("비겼음");
		}else if((player + 1) % 3 == com) { //3이 나올 수 있으니까  %3   
			System.out.println("플레이어 패");
		}else { 
			System.out.println("플레이어 승");
		}
		
		
		
	}

}
