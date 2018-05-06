package test;

public class Main {
	
	public static void main(String[] args) {
		int a[] = {-1, 0, 1, 2, -1, -4};
		int index, num;
		for(int i=0; i<5; i++) {
			if(a[i+1] < a[i]) {
				num = a[i+1];
				index = i;
				while(index>=0 && num<a[index]) {
					a[index+1] = a[index];
					index--;
				}
				a[index+1] = num;
			}
		}
		for(int i=0; i<6; i++)
			System.out.println(a[i]);
	}
}
