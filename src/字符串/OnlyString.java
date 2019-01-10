package 字符串;

import java.util.LinkedHashMap;
import java.util.Map;

public class OnlyString {
	public static void main(String[] args) {
		String string = "ssswaaadf";
		Solution lSolution = new Solution();
		System.out.println(lSolution.firstUniqChar(string));
	}
}

class Solution {
	public int firstUniqChar(String s) {
		 Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
         char[] arr = s.toCharArray();
         for(int i =0;i<arr.length;i++){
             if(!map.containsKey(arr[i])){
                 map.put(arr[i],i);
             }else{
                 map.put(arr[i],-1);
             }
         }
         for(Map.Entry<Character,Integer> entry :map.entrySet()){
             if(entry.getValue()!=-1){
            	 System.out.println(entry.getKey());
                 return entry.getValue();
             }
         }
         return -1;
		
	}
}