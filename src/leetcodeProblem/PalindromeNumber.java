package leetcodeProblem;

//completed and Accepted
/**
 * 
 * @author Sifat
 * @since 2020-04-30
 *
 */
public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-121));
	}

	public static boolean isPalindrome(int x) {

		int copyOfInt = x;
		long result = 0;

		boolean isNegative = false;
		if (x < 0) {
			isNegative = true;
//			x = Math.abs(x);
		} else {

			int temp = 0;
			while (x > 0) {
				temp = x % 10;
				x /= 10;
				result = (result * 10) + temp;
//				System.out.println(result);
			}
		}

		if (isNegative) {
			return false;
		} else {
			if (copyOfInt == result) {
				return true;
			} else {
				return false;
			}
		}
	}

}
//		if (isNegative && result < 2147483647) {
//			long value = result * 2;
//			result = result - value;
//		} else if (isNegative && result > 2147483647){
//			result = 0;
//		}

//		if (result > 2147483647) {
//			return 0;
//		} else {
//			return (int) result;
//		}
//	}
//}
