package 字符串.t2_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author 萝卜丁
 * @time 2018/1/9
 */
public class Solution {
	/**
	 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
	 * 
	 * */
	public boolean isAnagram(String s, String t) {
		//感觉提高效率
		if (s.length() != t.length()) {
			return false;
		}
		char[] ss = s.toCharArray();
		char[] tt = t.toCharArray();
		Arrays.sort(ss);
		Arrays.sort(tt);
		for (int i = 0; i < tt.length; i++) {
			if (ss[i] != tt[i]) {
				return false;
			}
		}
		
		return true;

	}
	
	public static void main(String[] args) {
		String s = "asd";
		String t = "dsa";
		Solution solution = new Solution();
		
		System.out.println(solution.isAnagram(s, t));
	}
}
