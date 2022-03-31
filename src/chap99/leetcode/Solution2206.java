package chap99.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution2206 {
	// nums를 key값으로 주고 value를 1씩 준다.
	// 중복된 key값이 있으면 value에 1 더해준다.
	// 그래서 value가 한개라도 홀수이면 false 이다. 
	public boolean divideArray(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums) {
            map.compute(num, (k, v) -> v == null ? 1 : v + 1);
        }
        
        java.util.Collection<Integer> values = map.values();
        for (Integer value : values) {
            if (value % 2 == 1) {
                return false;
            }
        }
        
        return true;
    }
}
