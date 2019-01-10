package t13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public int romanToInt(String s) {
		Map<String, Integer> map = new HashMap<>();
		// map= {'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000};
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("D", 500);
		map.put("M", 1000);
		int sum = 0;

		for (int i = 0; i < map.size(); i++) {
		}

		return 0;

	}
}
