import java.util.Calendar;

// 달력만들기
// 달력 형식에 맞게 출력 (for, %)
public class CalendarExam {
	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();

		//현재 월의 1일로 설정
		c.set(Calendar.DATE, 1);
		
		
		int startDayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("SU MO TU WE TH FR SA");
		for(int i = 1; i < startDayOfWeek; i++ ) {
			System.out.println("  ");
		}
		
		int year = c.get(Calendar.YEAR);

		System.out.println(year);
		// 실제 월에서 -1 한 값을 출력
		// 1월을 0월이라고 출력
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println(month);

		// int date = c.get(Calendar.DATE);
		// System.out.println(date);
		// 마지막 날짜 (현재 5월)
		int max = c.getMaximum(Calendar.DATE);
		for (int i = 1; i <= max; i++) {
			// 모든 일자를 출력
			System.out.print(" " + (i <10 ? " "+i : i)  );  //삼항연산자를 쓰고, 괄호로 묶어줌
			                           //i가 10보다 작다면, " "를 추가하고, 그렇지 않으면, 그냥 i를 출력
			if(i % 7 ==0 ) {
				System.out.println();
			}
			
			
		}
	}
}
