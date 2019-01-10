package t9;

/**
 * @author 萝卜丁
 *
 */
public class Solution {
	/**
	 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
	 * 
	 * 
	 */
	public boolean isPalindrome(int x) {
		if (x < 0 || x == 0) {
			return false;
		}
		String string = new StringBuilder(String.valueOf(x)).reverse().toString();
		return string.equals(String.valueOf(x));
	}

	/**
	 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
	 * 
	 * 不转换字符串
	 */
	public boolean isPalindrome1(int x) {
		if ((x != 0 && x % 10 == 0) || x < 0) {
			return false;
		}
		int revertedNumber = 0;
		while (x > revertedNumber) {
			revertedNumber = revertedNumber * 10 + x % 10;
			x = x / 10;
		}
		return x == revertedNumber / 10 || x == revertedNumber;
	}
	
	
	public static void main(String[] args) {
		int x = 12321;
		Solution solution = new Solution();
		System.out.println(solution.isPalindrome(x));
		}
}
