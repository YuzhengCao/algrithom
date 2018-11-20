package nowCoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * P为给定的二维平面整数点集。定义 P 中某点x，如果x满足 P 中任意点都不在 x 的右上方区域内（横纵坐标都大于x），
 * 则称其为“最大的”。求出所有“最大的”点的集合。（所有点的横坐标和纵坐标都不重复, 坐标轴范围在[0, 1e9) 内）
 * 如下图：实心点为满足条件的点的集合。请实现代码找到集合 P 中的所有 ”最大“ 点的集合并输出。
 */
public class Test1 {
	
	static class Node {
		int a;
		int b;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		List<Node> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			Node node = new Node();
			node.a = in.nextInt();
			node.b = in.nextInt();
			list.add(node);
		}
		Collections.sort(list, new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				return o1.a - o2.a;
			}
		});
		int tmp = list.get(N - 1).b;
		List<Node> c = new ArrayList<>();
		for (int i = N - 1; i > 0; i--) {
			if (list.get(i).b >= tmp) {
				c.add(list.get(i));
				tmp = list.get(i).b;
			}
		}
		for (int i = c.size() - 1; i >= 0; i--) {
			System.out.println(c.get(i).a + " " + c.get(i).b);
		}
	}
}
