/**
 * 题目：找出数组中下标为l和r之间的值为k数
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
