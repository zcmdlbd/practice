package 数组;

import java.util.Arrays;
import java.util.List;

public class MoveNums {

	public static class Solution {
		public void moveZeroes(int[] nums) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 0) {
					int b = i + 1;// 从当前i之后开始查询第一个不为0的元素
					while (b < nums.length) {
						if (nums[b] != 0) {
							nums[i] = nums[b];
							nums[b] = 0;
							break;// 交换完毕跳出while循环
						} else
							b++;
					}
					if (b == nums.length)// 0后不再有非0值结束循环
						break;

				}
			}
		}

		public void moveZeroes1(int[] nums) {

			for (int i = 0; i < nums.length; i++) {

			}
		}

		public static void main(String[] args) {
			Solution solution = new Solution();
			int[] nums = { 0, 1, 0, 3, 1, 2 };
			solution.moveZeroes(nums);
			for (int i = 0; i < nums.length; i++) {
				System.out.println(nums[i]);
			}
		}
	}
}
