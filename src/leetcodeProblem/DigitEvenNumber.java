package leetcodeProblem;
//accepted and completed
/**
 * 
 * @author Sifat
 * @since 2020-04-30
 */
public class DigitEvenNumber {

	public static void main(String[] args) {

		int[] nums = {555,901,482,1771};
		System.out.println(findNumbers(nums));

	}

	public static int findNumbers(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			String value = String.valueOf(nums[i]);
			
			if(value.length() % 2 == 0) {
				count++;
			}
		}
		return count;
	}

}
