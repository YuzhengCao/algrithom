package test;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		int a[] = {2,7,11,15};
		Integer target = 9, index = 0, i;
		Map<Integer, Integer> map = new HashMap<>();
		for(i=0; i<4; i++) {
			index = map.get(target - a[i]);
			if(index == null) {
				map.put(a[i], i);
			}else {
				break;
			}
		}
		System.out.println(index + "," + i);
	}
}
