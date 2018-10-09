package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 美丽的数，给定2个数a和b，找出位数为k的美丽的数的个数，规则为数的每一位为a或b，且每位相加的数的每位是a或b
 * 递归求出k位有几种排列组合情况，参考https://blog.csdn.net/u012814856/article/details/73863086
 * @author caoyuzheng
 *
 */
public class BeautifulWord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int k = in.nextInt();
		int sum = 0;
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		if (a < b) {
			for (int i = 0; i < k; i++) {
				list.add(a);
				list2.add(i + 1);
			}
		} else {
			for (int i = 0; i < k; i++) {
				list.add(b);
				list2.add(i + 1);
			}
		}
		if (check(list, a, b)) sum++;
		for (int i = 1; i < k; i++) {
			List<List<Integer>> lists = pailie(list2, i);
			List<Integer> tmp = new ArrayList<>();
			list.forEach(v -> tmp.add(v));
			for (List<Integer> v : lists) {
				if (a < b) {
					for (int j = 0; j < v.size(); j++) {
						tmp.set(v.get(j) - 1, b);
					}
					if (check(tmp, a, b)) sum++;
				} else {
					for (int j = 0; j < v.size(); j++) {
						tmp.set(v.get(j), a);
					}
					if (check(tmp, a, b)) sum++;
				}
			}
		}
		System.out.println(sum);
	}
	
	public static boolean check(List<Integer> list, int a, int b) {
		int sum = 0;
		for (int i : list) {
			if (i != a && i != b) {
				return false;
			}
			sum += i;
		}
		while (sum != 0) {
			if (sum % 10 != a && sum % 10 != b) {
				return false;
			}
			sum = sum / 10;
		}
		return true;
	}
	
	public static List<List<Integer>> pailie(List<Integer> list, int n) {
		List<List<Integer>> result = new ArrayList<>();
		if (n == 1) {
			for (int i = 0; i < list.size(); i++) {
				List<Integer> tmp = new ArrayList<>();
				tmp.add(list.get(i));
				result.add(tmp);
			}
			return result;
		}
		for (int i = 0; i < list.size(); i++) {
			List<Integer> tmp = new ArrayList<>();
			for (int j = 0; j < list.size(); j++) {
				if (i != j) {
					tmp.add(list.get(j));
				}
			}
			List<List<Integer>> res = pailie(tmp, n - 1);
			for (List<Integer> l : res) {
				l.add(list.get(i));
				result.add(l);
			}
		}
		return result;
	}
}
