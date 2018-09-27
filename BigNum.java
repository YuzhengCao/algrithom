package test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
/**
 * 95.123 12 0.1 1
 * 548815620517731830194541.899025343415715973535967221869852721 0.1 
 */
public class BigNumAdd {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		int count = in.nextInt();
//		BigInteger num = new BigInteger("2");
//		System.out.println(num.pow(count));
		String string = in.nextLine();
		String[] a = string.split(" ");
		for (int i = 0; i < a.length; i += 2) {
			System.out.print(new BigDecimal(a[i]).pow(Integer.valueOf(a[i+1])) + " ");
		}
	}
}
