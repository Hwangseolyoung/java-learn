package chap99.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution2032 {
	public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
		// int 배열에도 중복된 값이 있을 수 있으므로 
		// set에 넣어서 중복된 값 제거함
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }
        
        Set<Integer> set3 = new HashSet<>();
        for (int num : nums3) {
            set3.add(num);
        }
        
        // Map에 set1에 값을 key로 value는 1로 넣어줌
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : set1) {
            map.put(num, 1);
        }
        // set2의 값을 탐색해 map과 동일한 key가 있으면 value의 값을 1씩 늘려줌
        // 만약 동일한 key가 존재하지 않으면 value는 1로 넣어줌
        for (Integer num : set2) {
            if (map.containsKey(num)) {
                Integer val = map.get(num);
                map.put(num, val + 1);
            } else {
                map.put(num, 1);
            }
        }
        // set3에 set2와 동일한 코드 작업
        for (Integer num : set3) {
            if (map.containsKey(num)) {
                Integer val = map.get(num);
                map.put(num, val + 1);
            } else {
                map.put(num, 1);
            }
        }
        // map에 value의 값이 1이상일 경우는 set1, 2, 3에 중복된 값들이 존재했다는 것이므로
        // entry value를 탐색하여 중복된 key를 찾아 list로 만들어 리턴해준다.
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }
        
        return result;
    }

}
