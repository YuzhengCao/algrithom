import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 一棵无限大的满二叉树，根节点为从1开始计，左节点为2*i，右节点为2*i+1，到一个节点可以选择+这个节点的值或-这个节点的值。
 * 问经过k步，总值为n的路径中，节点值之和最小的路径，例子：
 * 6 3
 * 1-
 * 2+
 * 5+
 * @author joke
 *
 */
public class Main7 {
	static List<Integer> list = new ArrayList<>();
	static List<List<String>> list3 = new ArrayList<>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		List<String> list2 = new ArrayList<>();
		add(0, 1, n, k, 0, list2);
		sub(0, 1, n, k, 0, list2);
		int res = list.get(0);
		int flag = 0;
		for (int i = 1; i < list.size(); i++) {
			if (res > list.get(i)) {
				res = list.get(i);
				flag = i;
			}
		}
		int length = list3.get(flag).size();
		for (int i = 0; i < length; i++) {
			System.out.println(list3.get(flag).get(i));
		}
	}
	
	public static void add(int sum, int x, int n, int k, int num, List<String> list2) {
		num += x;
		sum += x;
		list2.add(x + "+");
		if (sum == n) {
			list.add(num);
			list3.add(new ArrayList<>(list2));
			list2.remove(list2.size() - 1);
			return;
		}
		if (sum > n) {
			list2.remove(list2.size() - 1);
			return;
		}
		k--;
		if (k < 0) {
			list2.remove(list2.size() - 1);
			return;
		}
		add(sum, 2 * x, n, k, num, list2);
		sub(sum, 2 * x, n, k, num, list2);
		add(sum, 2 * x + 1, n, k, num, list2);
		sub(sum, 2 * x + 1, n, k, num, list2);
		list2.remove(list2.size() - 1);
	}
	
	public static void sub(int sum, int x, int n, int k, int num, List<String> list2) {
		num += x;
		sum -= x;
		list2.add(x + "-");
		if (sum == n) {
			list.add(num);
			list3.add(new ArrayList<>(list2));
			list2.remove(list2.size() - 1);
			return;
		}
		if (sum > n) {
			list2.remove(list2.size() - 1);
			return;
		}
		k--;
		if (k < 0) {
			list2.remove(list2.size() - 1);
			return;
		}
		add(sum, 2 * x, n, k, num, list2);
		sub(sum, 2 * x, n, k, num, list2);
		add(sum, 2 * x + 1, n, k, num, list2);
		sub(sum, 2 * x + 1, n, k, num, list2);
		list2.remove(list2.size() - 1);
	}
}
