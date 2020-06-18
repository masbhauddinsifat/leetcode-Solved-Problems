package leetcodeProblem;
//done and accepted
/**
 * 
 * @author Sifat
 * @since 2020-05-01
 */
public class ReduceNumberToZero {

	public static void main(String[] args) {
		int val = 8;
		int result = numberOfSteps(val);
		System.out.println(result);
	}

	public static int numberOfSteps(int num) {
		int count = 0;
		boolean isZero = false;
		while (num > 0) {
			 
			if (num % 2 == 1) {
				num -= 1;
				if (num == 0) {
					count++;
					isZero = true;

				} else {
					count++;
				}
			}

			if (isZero) {
				break;
			} else {
				num /= 2;
				count++;
			}
		}

		return count;
	}
}
