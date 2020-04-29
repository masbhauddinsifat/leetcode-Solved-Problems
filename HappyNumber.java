package leetcodeProblem;

//Done and accepted
/**
 * 
 * @author Sifat
 * @since 2020-04-27
 *
 */
public class HappyNumber {

	public static void main(String[] args) {
		System.out.println(isHappy(2));

	}

	public static boolean isHappy(int n) {

		return hello(n);
	}

	public static boolean hello(int n) {
		int value = numberValidation(n);
		
		boolean output = false;
		if(value == 1) output = true;
		while (value > 1) {
			System.out.println(value);

			value = numberValidation(value);

			if (value > 1 && value <= 9) {
				output = false;
				break;
			} else if (value < 1) {
				output = false;
				break;
			} else if (value == 1) {
				output = true;
				break;
			}
		}

		return output;

	}

	private static int numberValidation(int n) {
		String num = String.valueOf(n);
		String[] nums = num.split("");

		int value = 0;
		for (String string : nums) {

			int square = Integer.parseInt(string);
			square = square * square;
			value += square;
		}
		return value;
	}

}
