package chap99.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution1684 {
	public int countConsistentStrings(String allowed, String[] words) {
        // 1.String을 Set에 넣어준다.
    	int cnt = 0;
        
        Set<Character> set = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }
        // 3. String 배열을 탐색하며 consistent method를 사용하여
        // set의 Character가 String 배열과 동일한 글자가 있으면 cnt++ 해준다.
        for (String word : words) {
            if (consistent(set, word)) {
                cnt++;
            }
        }
        
        return cnt;
    }
    // 2. consistent method를 만들어서 set과 String 배열에 같은 문자열이 있는지
    // 알아보는 코드를 작성한다.
    private boolean consistent(Set<Character> set, String word) {
        for (char c : word.toCharArray()) {
            if (!set.contains(c)) {
                return false;
            }
        }
        
        return true;
    }

}
