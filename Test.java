/* a~z全排列，输出下一个
   1.首先从最尾端开始往前寻找两个相邻元素，令第一元素为*i,第二元素为*ii,且满足*i<*ii

   2.找到这样一组相邻元素后，再从最尾端开始往前检验，找出第一个大于*i的元素，令为*j，将i,j元素对调

   3.再将ii之后的所有元素排序
*/
import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char[] a = s.toCharArray();
		char[] b = new char[26];
		if(s.length() == 26){
			for(int i=25; i>0; i--){
				if(a[i-1] < a[i]){
					for(int j=25; j>0; j--) {
						if(a[j] > a[i-1]) {
							a[i-1] = a[j];
							String res = "";
							for(int k=0; k<i; k++) {
								res += a[k];
							}
							System.out.println(res);
							return;
						}
					}
				}
			}
			System.out.println(-1);
		} else{
			for(int i=0; i<s.length(); i++){
				b[a[i]-'a'] = a[i];
			}
			for(int i=0; i<26; i++){
				if(b[i] == 0){
					b[i] = (char) ('a' + i);
					System.out.println(s+b[i]);
					return;
				}
			}
		}
	}
}
