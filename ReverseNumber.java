package leetcodeProblem;

//solve and accepted

/**
 * 
 * @author Sifat
 * @since 2020-04-28
 *
 */
public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println(reverse(123));
	}

	public static int reverse(int x) {

		boolean isNegative = false;
		if (x < 0) {
			isNegative = true;
			x = Math.abs(x);
		}
		long result = 0;
		int temp = 0;
		while (x > 0) {
			temp = x % 10;
			x /= 10;
			result = (result * 10) + temp;
//			System.out.println(result);
		}

		if (isNegative && result < 2147483647) {
			long value = result * 2;
			result = result - value;
		} else if (isNegative && result > 2147483647){
			result = 0;
		}

		if (result > 2147483647) {
			return 0;
		} else {
			return (int) result;
		}
	}
}
