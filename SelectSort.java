package test;

public class Main {
	
	public static void main(String[] args) {
		int a[] = {-1, 0, 1, 2, -1, -4};
		int index;
		for(int i=0; i<6; i++) {
			index = i;
			for(int j=i+1; j<6; j++) {
				if(a[j] < a[index]) {
					index = j;
				}
			}
			int tmp = a[i];
			a[i] = a[index];
			a[index] = tmp;
		}
		for(int i=0; i<6; i++)
			System.out.println(a[i]);
	}
}
