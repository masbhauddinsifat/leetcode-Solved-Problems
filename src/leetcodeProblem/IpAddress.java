package leetcodeProblem;

//done and accepted
/**
 * 
 * @author Sifat
 * @since 2020-05-01
 *
 */
public class IpAddress {

	public static void main(String[] args) {
		String address = "1.1.1.1";
		String result = defangIPaddr(address);
		System.out.println(result);
	}

	public static String defangIPaddr(String address) {
		address = address.replace(".", "[.]");
		return address;
	}

}
