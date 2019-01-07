package xuexi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Array {
	
	public int[] intersect(int[] nums1,int[] nums2) {
		Map<Integer, Integer> modelmap = new HashMap<>();
		for (int i = 0; i < nums1.length; i++) {
			int num = nums1[i];
			if (modelmap.containsKey(num)) {
				modelmap.put(num, modelmap.get(num)+1);
			}else {
				modelmap.put(num, 1);
			}
		}
		
		List<Integer> tempList = new ArrayList<>();
		for (int i = 0; i < nums2.length; i++) {
			if (modelmap.containsKey(nums2[i]) && modelmap.get(nums2[i]) > 0) {
				modelmap.put(nums2[i], modelmap.get(nums2[i])-1);
				tempList.add(nums2[i]);
			}
		}
		
		
		int[] result = new int[tempList.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = tempList.get(i);
		}
		
		return result;
		
	}
	
	/**
	 * 给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。
	 * @author 萝卜丁
	 * */
	
	public class Solution {
	    public int[] plusOne(int[] digits) {
	    	for (int i = digits.length-1; i >= 0 ; i--) {
				if (digits[i] < 9) {
					digits[i] = digits[i]+1;
					return digits;
				}
				else {
					digits[i] = 0;
				}
				
			}
			return digits;
	       
	    }   
	}
	
}
