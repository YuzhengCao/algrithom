/**
 * 题目：找出数组中下标为l和r之间的值为k数
 * 输入： 第1行为n代表用户的个数 第2行为n个整数，第i个代表用户标号为i的用户对某类文章的喜好度 
 * 第3行为一个正整数q代表查询的组数  第4行到第（3+q）行，每行包含3个整数l,r,k代表一组查询，
 * 即标号为l<=i<=r的用户中对这类文章喜好值为k的用户的个数。数据范围n <= 300000,q<=300000 k是整型
 * 问题：不能数组直接遍历，会超时	list需要判断为空，会抛异常	检查数组下标，没写=号报错
 */
import java.util.*;

public class UserHobby {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[300010];
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int tmp = in.nextInt();
			List<Integer> list = new LinkedList<Integer>();
			if (map.containsKey(tmp)) {
				list = map.get(tmp);
			}
			list.add(i);
			map.put(tmp, list);
		}
		int q = in.nextInt();
		int[] b = new int[300010];
		for (int i = 0; i < q; i++) {
			int l = in.nextInt();
			int r = in.nextInt();
			int k = in.nextInt();
			List<Integer> list = map.get(k);
			if (list != null) {
				for (Integer t : list) {
			        if (t <= r - 1 && t >= l - 1) {
			            b[i]++;
			        }
			    }
			}
		}
		for (int i = 0; i < q; i++) {
			System.out.println(b[i]);
		}
	}
}
