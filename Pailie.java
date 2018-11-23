package nowCoder;

public class Pailie {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		dfs(a, 0, 5);
	}
	
	public static void dfs(int[] a, int l, int r) {
		if (l == r) {
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]);
			}
			System.out.println();
			return;
		}
		for (int i = l; i < r; i++) {
			int tmp = a[i];
			a[i] = a[l];
			a[l] = tmp;
			dfs(a, l + 1, r);
			tmp = a[i];
			a[i] = a[l];
			a[l] = tmp;
		}
	}
}
