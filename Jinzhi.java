/*
 * 10#15
 * 8#17
 * 2#1111
 * 4#33
 * END
 */
package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		List<Integer> l3 = new ArrayList<>();
		String line = "";
		while (!"END".equals(line = in.nextLine())) {
			Integer jinzhi = Integer.valueOf(line.substring(0, line.indexOf("#")));
			Integer num = Integer.valueOf(line.substring(line.indexOf("#") + 1, line.length()));
			l1.add(jinzhi);
			l2.add(num);
		}
		for (int i = 0; i < l1.size(); i++) {
			int num = l2.get(i);
			int index = 0;
			int sum = 0;
			while (num != 0) {
				sum += num % 10 * Math.pow(l1.get(i), index);
				index++;
				num /= 10;
			}
			l3.add(sum);
		}
		for (Integer i : l3) {
			System.out.println(i);
		}
	}
}
