package leetcodeProblem;

/**
 * 
 * @author Sifat
 * @since 2020-06-18
 */
//solved and accepted
public class MoveZeros {
	public static void main(String[] args) {
		int[] array = {0,1,0,3,12};
		moveZeroes(array);
	}
	
	public static void moveZeroes(int[] nums) {
		int count = 0;
        int[] values = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) {
				values[count] = nums[i];
				count++;
			}
			// System.out.print(nums[i]+" ");
		}
		
		for (int i = 0; i < values.length; i++) {
			nums[i] = values[i];
		}
    }

}
