//Q2.
public class Exam05_4 {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		System.out.println(Integer.MAX_VALUE);

		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		for (int i = 0; i < 10; i++) {
			int a = nums[0];
			int ran = (int) (Math.random() * nums.length);
			char temp = ' ';
			temp = nums[0];
			nums[0] = nums[ran];
			nums[ran] = temp;

		}
		System.out.println(nums);
	}
}