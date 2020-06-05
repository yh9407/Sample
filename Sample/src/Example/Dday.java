package Example;

import java.util.Calendar;

public class Dday {
	public static void main(String[] args) {
		// Q.오늘로부터 100일 뒤가 몇일인지 알고싶다면.
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE,1000);//앞은 년,월,일의 종류 ,뒤는 amount
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1; //0월부터 11월까지 출력 +1이 필요
		int date = c.get(Calendar.DATE);
		System.out.println(year + "년 " + 
		(month <10 ? "0" + month : month) + "월 " +
		(date < 10 ? "0" + date :date) + "일") ; //삼항연산자로 한자리 월,일에 앞에 "0"추가
	}
}
