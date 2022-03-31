package chap99.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution1512 {
	public int numIdenticalPairs2(int[] nums) {
		// 갯수를 세는 코드를 먼저 작성하라
		Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        
        int result = 0;
        // value만 꺼내는 values()메소드 이용
        java.util.Collection<Integer> values = map.values(); // java.util.-> 리트코드가 자동임포트가 안되서 풀네임 써줌
        for (Integer value : values) {
        	// 쌍을 이루는 규칙을 보면 n * n(-1) / 2
        	result += (value) * (value-1) / 2;
        }   
        
        return result;
    }
	
	// 전에 for문 배웠을때 풀어본 코드
    public int numIdenticalPairs(int[] nums) {
        
        int count = 0;
        int n = nums.length;
        
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        
        return count;
    }

}
