package leetcodeProblem;
/**
 * 
 * @author Sifat
 * @since2020-06-18
 */
//solved and accepted
public class SearchAndInsertPosition {

	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		int target = 7;
		
		System.out.println(searchInsert(nums,target));
	}

	public static int searchInsert(int[] nums, int target) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == target) {
				return i;
			}
			if(nums[i]> target) {
				return i;
			}
			count++;
		}
		return count;
		
	}

}
