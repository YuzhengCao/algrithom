import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[100010];
        int[] f = new int[100010];
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }
        f[0] = a[0];
        int max = a[0];
        for(int i=1;i<n; i++){
            if(f[i-1] < 0){
                f[i] = a[i];
            } else{
                f[i] = f[i-1] + a[i];
            }
            if(max < f[i]){
                max = f[i];
            }
        }
        System.out.println(max);
    }
}