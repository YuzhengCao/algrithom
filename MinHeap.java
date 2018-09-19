
public class MinHeap {

	private int[] data;
	
	public MinHeap(int[] data) {
		this.data = data;
		for (int i = data.length/2 - 1; i > 0; i--) {
			heapify(i);
		}
	}
	
	public void heapify(int i) {
		int l = 2 * (i + 1) - 1;
		int r = 2 * (i + 1);
		int smallest = i;
		if (data[i] > data[l]) {
			smallest = l;
		}
		if (r < data.length && data[i] > data[r]) {
			smallest = r;
		}
		if (smallest == i) {
			return;
		}
		int tmp = data[i];
		data[i] = data[smallest];
		data[smallest] = tmp;
		heapify(smallest);
	}
	
	public int getRoot() {
		return data[0];
	}
	
	public void setRoot(int root) {
		data[0] = root;
		heapify(0);
	}
}
