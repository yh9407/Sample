package Example;

public class StringSpeedTest {
	public static void main(String[] args) {
		String s = "";
		System.out.println(System.currentTimeMillis());
		for (int i = 1; i < 50000; i++) {
			s += i;

		}
		System.out.println(System.currentTimeMillis());
		StringBuffer sb = new StringBuffer();//처리속도가 빠름
		for (int i = 0; i < 50000; i++) {
			sb.append(i);
		}
		System.out.println(System.currentTimeMillis());
	}
}
