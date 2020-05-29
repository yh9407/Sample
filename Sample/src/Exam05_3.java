//Q2.
public class Exam05_3 {
	public static void main(String[] args) {

		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		for (int i = 0; i < 10; i++) {
			int a = nums[0];
			int ran = (int) (Math.random() * nums.length);
			int b = nums[ran];
			int temp = a;
			a = b;
			b = temp;
			nums[0] = (char) a;
			nums[ran] = (char) b;
		}
		System.out.println(nums);
	}
}