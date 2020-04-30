package leetcodeProblem;
//Done and Accepted
/**
 * 
 * @author Sifat
 * @since 2020-04-28
 */
public class TwoSum {

	public static void main(String[] args) {
		int[] nums=  {3,2,4};
		int terget = 6;
		
		nums = twoSum(nums, terget);
		for (int i : nums) {
			System.out.println(i);
		}
	}
	public static int[] twoSum(int[] nums, int target) {
		boolean isFound = false;
		int[] numbers = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					isFound = true;
					numbers[0] = i;
					numbers[1] = j;
					break;
				}
			}
			if (isFound) {
				break;
			}
		}

		return numbers;
	}
}
