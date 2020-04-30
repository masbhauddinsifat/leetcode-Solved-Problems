package leetcodeProblem;

import java.util.ArrayList;
import java.util.Arrays;

// completed and Accepted
/**
 * 
 * @author Sifat
 *  @since2020-04-2020
 *
 */
public class StringToInt {

	public static void main(String[] args) {
		String value = "-2147483647";
		System.out.println(myAtoi(value));
//		myAtoi(value);
	}

	public static int myAtoi(String str) {
		Integer value = 0;
		str = str.trim();
		String val = "";
		boolean isNagative = false;

		if (str.length() == 1) {
			val = str;
		} else if (str.length() == 2) {
			if (str.startsWith("-")) {
				val = str.substring(1).trim();
				isNagative = true;
			} else if (str.startsWith("+")) {
				val = str.substring(1).trim();

			} else {
				val = str.substring(0, 1).trim();
			}
		} else if (str.length() > 2) {

			if (str.startsWith("-")) {
				val = str.substring(1, 2).trim();
				isNagative = true;
			} else if (str.startsWith("+")) {
				val = str.substring(1, 2).trim();

			} else {
				val = str.substring(0, 1).trim();
			}

		}

		try {

			double d = Double.parseDouble(val);
			value = (int) d;

			if (value instanceof Integer) {

				if (str.startsWith("-")) {
					str = str.substring(1);
					isNagative = true;
				}

				boolean isPossitive = false;
				if (str.startsWith("+")) {
					str = str.substring(1);
					isPossitive = true;
				}

				String[] strArray = str.split("");
				str = "";

				for (int i = 0; i < strArray.length; i++) {
					if (strArray[i].matches("[a-zA-T +-]")) {
						break;
					} else {
						str += strArray[i];
//						System.out.println(str);
					}
				}

				strArray = null;
				strArray = str.split("");
				str = "";
				ArrayList<String> al = new ArrayList<>(Arrays.asList(strArray));
//				System.out.println(al);
				boolean zeroBeforeNumber = true;
				for (int i = 0; i < al.size(); i++) {
					if (al.get(i).equals("0") && zeroBeforeNumber) {
						continue;
					} else {
						str += al.get(i);
						zeroBeforeNumber = false;
					}
				}
//				System.out.println(str);

				if (isNagative && isPossitive) {
					str = "0";
				}

				int num = 0;

				val = "";
				value = 0;

				if (str.length() == 10 && str.startsWith("21")) {

					val = str.substring(str.length() - 2);
					num = Integer.parseInt(val);

					if (isNagative) {
						if (num > 48) {
							value = -2147483648;
//								System.out.println(value);
						} else {
							str = "-" + str;
							double a = Double.parseDouble(str);
							value = (int) a;
						}
					} else {
						if (num > 47) {
							value = 2147483647;
//							System.out.println(value);
						} else {
							double a = Double.parseDouble(str);
							value = (int) a;
						}
					}

				} else if (str.length() > 10) {
					if (isNagative) {
						value = -2147483648;
					} else {
						value = 2147483647;
					}
				} else {
					if (isNagative) {
						str = "-" + str;
					}
					double a = Double.parseDouble(str);
					value = (int) a;
//						System.out.println(value);
				}

			}
		} catch (Exception e) {
			return value;
		}
		return value;

	}
}
