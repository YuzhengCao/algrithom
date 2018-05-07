package test;

public class Main {
	
	public static void main(String[] args) {
		String s = "abcdabc";
		int len = 0, index = 0;
		char a[] = s.toCharArray();
		for(int i=0; i<s.length()-1; i++) {
			for(int j=i+1; j<s.length(); j++) {
				if(a[j] == a[i]) {
					int k = j;
					int l = i;
					while(k != s.length() && a[k] == a[l]) {
						k++;
						l++;
					}
					if(len < k-j) {
						len = k-j;
						index = j;
					}
				}
			}
		}
		System.out.println(index);
		System.out.println(len);
		for(int i=index; i<index+len; i++) {
			System.out.print(a[i]);
		}
	}
}
