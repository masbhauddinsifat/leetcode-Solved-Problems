package leetcodeProblem;

//done and accepted
/**
 * 
 * @author Sifat
 * @since2020-05-01
 *
 */
public class ProductAndSum {
	public static void main(String[] args) {
		
		int n = 4421; 
		System.out.println(subtractProductAndSum(n));
	}

	public static int subtractProductAndSum(int n) {
		
		int result = 0;
		int sum = 0;
		int product = 1;
		
		while(n > 0) {
			int temp = n % 10;
			sum+= temp;
			product *= temp;
			
			n= n / 10;
		}
		
		result = product - sum;
		
		return result;
	}
}
