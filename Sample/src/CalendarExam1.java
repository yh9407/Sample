import java.util.Calendar;

public class CalendarExam1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		// 현재 월의 1일로 설정
		cal.set(Calendar.DATE, 1);

		int startDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
//		for (int e = 1; e < startDayOfWeek; e++) {
//			System.out.print(" ");

		int endDate = cal.getActualMaximum(Calendar.DATE);
		for (int i = 1, n = startDayOfWeek; i <= endDate; i++, n++) {
			System.out.print((i < 10 ? " " + i : " " + i));
			if (n % 7 == 0) {
				System.out.println();
			}
		}
	}
}
