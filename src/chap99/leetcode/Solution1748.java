package chap99.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution1748 {
		// 중복이 안되면 value가 null, 중복되는 수에 value값을 1씩 주고
		// value의 값이 1이상인 key만 꺼내서 더해줌
	public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.compute(num, (k, v) -> v == null ? 1 : v + 1);
        }
        
        int result = 0;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result += entry.getKey();
            }
        }
        
        return result;
    }
	
	// 내가 작성한 것 오류남 
	public int sumOfUnique(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums) {
            list.add(num);
        }
        
        int sum = 0;
        for(int item : list) {
            if(list.contains(item)){
                list.remove(item);
            } else {
                sum += item;
            }
        }
        
        return sum;
        
    }
}
