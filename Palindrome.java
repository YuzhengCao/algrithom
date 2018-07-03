/*
 *把String倒置，找出最长公共子串就是最长回文子串
 */
public class Main {

	public static void main(String[] args) {
		String S = "abacdfgdcaba";
		String T = new StringBuilder(S).reverse().toString();
		String max = "";
		for (int i = 0; i < T.length(); i++) {
			for (int begin = 0, end = T.length() - i; end < T.length(); begin++, end++) {
				String tmp = T.substring(begin, end);
				if (S.contains(tmp)) {
					if (T.charAt(begin) == T.charAt(end)) {
						max = tmp;
						System.out.println(max);
						return;
					}
				}
			}
		}
	}
}
