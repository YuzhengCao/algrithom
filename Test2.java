public class Test2 {
	
	public static int a[] = {1,2,3,4,5,6,7,8};
	
	public static boolean check() {
		for(int r=0; r<8; r++) {
			for(int i=0; i<8; i++){
				if((a[i] - a[r] == r - i || a[i] - a[r] == i - r) && r != i) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean permutation() {
		for(int i=7; i>0; i--) {
			if(a[i-1] < a[i]){
				for(int j=7; j>0; j--) {
					if(a[j] > a[i-1]) {
						int tmp = a[i-1];
						a[i-1] = a[j];
						a[j] = tmp;
						for(int k=i; k<8; k++) {
							for(int l=i; l<7; l++) {
								if(a[l] > a[l+1]) {
									tmp = a[l];
									a[l] = a[l+1];
									a[l+1] = tmp;
								}
							}
						}
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int count = 0;
		while(true) {
			if(check()) {
				for(int i=0; i<8; i++) {
					for(int j=0; j<8; j++) {
						if(a[i] == j+1) {
							System.out.print("@");
						} else {
							System.out.print("*");
						}
					}
					System.out.println();
				}
				System.out.println();
				count++;
			}
			if(permutation()) {
				System.out.println(count);
				System.out.println("曹煜政 201593136\n柴星宇 201593104\n");
				return;
			}
		}
	}
}
