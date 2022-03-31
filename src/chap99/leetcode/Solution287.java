package chap99.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution287 {
	public int findDuplicate(int[] nums) {
		// set은 중복 저장이 안되므로
		// nums를 탐색해서 set에 넣어줄때 중복된 값을 num에 담아서 return해줌
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        
        return 0;
    }

}
