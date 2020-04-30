package leetcodeProblem;

//solve and accepted

/**
 * 
 * @author Sifat
 * @since 2020-04-30
 *
 */
public class SmallerThanCurrent {

	public static void main(String[] args) {
		int[] nums = {7,7,7,7};
		int[] values = smallerNumbersThanCurrent(nums);
		for (int i : values) {
			System.out.print(i+" ");
		}
	}

	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int[] values = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if(nums[i]== nums[j]) {
					continue;
				} else if(nums[i] > nums[j]) {
					count++;
				}
			}
			values[i] = count;
			
		}
		return values;

	}

}
