package Example;

public class SubString {
	public static void main(String[] args) {
		String nowDate = "20150926";
		nowDate = nowDate.substring(0, 4) + "-" +
		nowDate.substring(4, 6) + "-" + nowDate.substring(6);
		System.out.println(nowDate);

		String inputDate = "2015-09-26";
		inputDate = inputDate.substring(0, 4) + "��" +
		inputDate.substring(5, 7) + "��" + inputDate.substring(8) + "��";

		System.out.println(inputDate); //
	}
}