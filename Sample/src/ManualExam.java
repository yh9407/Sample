import java.util.Scanner;

public class ManualExam {
	public static void main(String[] args) {
		// 무한반복 상태
		boolean isRun = true; //1번 호출,2번호출 계속 프로그램이 돌아야함.
		// 학생 수
		int studentNum = 0; 
		// 학생별 점수
		int[] scores = null; //배열은 갯수가 정해져아함.[ ]
		Scanner scan = new Scanner(System.in);
		while (isRun) {
			System.out.println("======================================");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("======================================");
			System.out.print("선택 > ");

			int selectNo = scan.nextInt(); //입력받을 때 까지 대기상태 .

			if (selectNo == 1) {
				System.out.println("학생수 입력> ");
				studentNum = scan.nextInt(); //변수의 선언의 범위가 중요. 이 변수들은 while보다 상위에 위치
				scores = new int[studentNum]; //배열의 생성. -> scores에 넣는다

			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length ; i++) {
					System.out.print("scores[" + i + "]> ");

					scores[i] = scan.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%s] >%s\n", i , + scores[i]);
				}

			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for (int i = 0; i < scores.length; i++) {
					max = (max < scores[i]) ? scores[i] : max; 
					//scores[i]가 max보다 크다면 scores[i]를 출력 , 아니면 max 다시 max
					
					sum += scores[i];
				}
				avg = (double) sum / studentNum;
				System.out.println("최고 점수  : " + max);
				System.out.println("평균 점수  : " + avg);

			} else if (selectNo == 5) {
				isRun = false;
			}
		}
		scan.close();
		System.out.println("프로그램 종료");
	}
}
