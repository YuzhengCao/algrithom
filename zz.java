import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int max = 1;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length() + 1; j++) {
				if (check(s.substring(i, j))) {
					if (max < s.substring(i, j).length()) {
						max = s.substring(i, j).length();
					}
				}
			}
		}
		System.out.println(max);
	}

	public static boolean check(String s) {
		for (int i = 1; i < s.length(); i++) {
			if (s.substring(0, i).contains(String.valueOf(s.charAt(i)))) {
				return false;
			}
		}
		return true;
	}
}
