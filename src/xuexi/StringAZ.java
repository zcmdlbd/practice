package xuexi;


/**
 *反转字符串
 * 
 * */
public class StringAZ {
	public static void main(String[] args) {
		String string = "a.b.c..f.";
		Solution solution = new Solution();
		
		System.out.println(solution.reverseString(string));
	}
	public static class Solution {
	    public String reverseString(String s) {
		
	    	if (s == null) {
				return null;
			}
	    	int len = s.length();
	    	char[] cs = s.toCharArray();
	    	char[] cs2 = new char[len];
	    	for (int i = 0; i < len; i++) {
				cs2[i] = cs[len-1-i];
			}
	    	String s2 = String.valueOf(cs2);
	    	return s2;
	        
	    }
	}
}
