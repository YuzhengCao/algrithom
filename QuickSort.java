/**
 * 采用分治的思想，将记录分成两份，选择一个基准，比它小的放在左边，大的放右边
 * 再递归的对两边进行排序
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 6, 3, 2, 4, 5 };
		quickSort(arr, 0, 4);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void quickSort(int[] arr, int l, int r) {
		int index = l;
		if (l == r) {
			return;
		}
		while (l < r) {
			if (arr[r] < arr[index]) {
				while (l < r) {
					if (arr[l] > arr[index]) {
						int tmp = arr[l];
						arr[l] = arr[r];
						arr[r] = tmp;
					}
					l++;
				}
			}
			r--;
		}
		int tmp = arr[l];
		arr[l] = arr[index];
		arr[index] = tmp;
		quickSort(arr, index, r);
		quickSort(arr, r + 1, arr.length - 1);
	}
}
