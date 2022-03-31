package chap99.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution2006 {
	// 내가 작성한 코드 컬렉션 사용못함
	 public int countKDifference(int[] nums, int k) {
	        int cnt = 0;
	        for(int i = 0; i < nums.length; i++) {
	            for(int j = 0; j < nums.length; j++) {
	                if(nums[i] - nums[j] == k) {
	                    cnt++;
	                }
	            }
	        
	        }
	        
	        return cnt;
	        
	    }
	 
	 public int countKDifference(int[] nums, int k) {
	        Map<Integer, Integer> map = new HashMap<>();
	        
	        // map에 nums를 key값으로 주고 value는 임의의수로 정한다
	        for (int num : nums) {
	            map.compute(num, (key, v) -> v == null ? 1 : v + 1);
	        }
	        
	        // 그런다음 k만큼 차이나는 키값을 찾는다.
	        int result = 0;
	        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	            Integer target = entry.getKey() + k;
	            
	            if (map.containsKey(target)) {
	                result += entry.getValue() * map.get(target);
	            }
	        }
	        
	        return result;
	    }

}
