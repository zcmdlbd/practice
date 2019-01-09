package 数组;

import java.util.Arrays;


/**
 * 两数之和
 * 
 * */
public class Sums {
	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		Solution solution = new Solution();

		System.out.println(Arrays.toString(solution.twoSum(nums, target)));
	}

	static class Solution {
		public int[] twoSum(int[] nums, int target) {
			for (int i = 0; i < nums.length; i++) {
				for (int j = 0; j < nums.length; j++) {
					if (nums[i] + nums[j] == target && i != j) {
						int[] nums1 = { i, j };
						return nums1;
					}
				}
			}
			return nums;

		}

	}
}
