package nowCoder;

public class Zuhe {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		boolean[] visited = new boolean[5];
		for (int i = 1; i < 6; i++) {
			dfs(a, 0, 0, i, visited);
		}
	}
	
	public static void dfs(int[] a, int cur, int count, int k, boolean[] visited) {
		if (count == k) {
			for (int i = 0; i < a.length; i++) {
				if (visited[i]) {
					System.out.print(a[i]);
				}
			}
			System.out.println();
			return;
		}
		if (cur == a.length) {
			return;
		}
		visited[cur] = true;
		//处理在子串a[pos+1, n-1]中取出k-1个数的子问题
		dfs(a, cur + 1, count + 1, k, visited);
		//回溯
		visited[cur] = false;
		//处理在子串a[pos+1, n-1]中取出k个数的问题
		dfs(a, cur + 1, count, k, visited);
	}
	
}
