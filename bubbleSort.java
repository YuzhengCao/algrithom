package test;

public class Main {
	
	public static void main(String[] args) {
		int a[] = {-1, 0, 1, 2, -1, -4};
		for(int i=0; i<6; i++) {
			for(int j=0; j<5-i; j++) {
				if(a[j]>a[j+1]) {
					int tmp = a[j+1];
					a[j+1] = a[j];
					a[j] = tmp;
				}
			}
		}
		for(int i=0; i<6; i++)
			System.out.println(a[i]);
	}
}
