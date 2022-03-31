package chap99.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution771 {
	// set을 이용한 강사님 코드
	public int numJewelsInStones2(String jewels, String stones) {
		Set<Character> set = new HashSet<>();

		for (char c : jewels.toCharArray()) {
			set.add(c);
		}

		int cnt = 0;

		for (char c : stones.toCharArray()) {
			if (set.contains(c)) {
				cnt++;
			}
		}

		return cnt;

	}
	// chatAt을 이용한 강사님 코드
	public int numJewelsInStones(String jewels, String stones) {
		int cnt = 0;
		for (int i = 0; i < jewels.length(); i++) {
			for (int j = 0; j < stones.length(); j++) {
				if (jewels.charAt(i) == stones.charAt(j)) {
					cnt++;
				}
			}
		}

		return cnt;
	}
	
	// 내가 작성했던 것
	public int numJewelsInStones(String jewels, String stones) {
        String[] jewl = jewels.split("");
        String[] stone = stones.split("");
        
        int cnt = 0;
        for(int i = 0; i < jewl.length; i++) {
            for(int j = 0; j < stone.length; j++) {
                if(jewl[i].equals(stone[j]))
                    cnt++;
            }
        }
        
        return cnt;
    }

}
