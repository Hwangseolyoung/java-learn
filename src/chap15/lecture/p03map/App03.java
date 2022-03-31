package chap15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;

public class App03 {
	public static void main(String[] args) {
		// compute() 메소드
		// 파라미터에 (k, v) 입력하는데 1번째 메소드 key, 2번째 메소드는 value나 추상메소드
		// -> 이후 입력값으로 파라미터 앞의 key에 value값이 결정되고
		// 값이 없어도 없어도 null로 넣어줘야함
		Map<Integer, Integer> map = new HashMap<>();

		map.compute(3, (k, v) -> 100);

		System.out.println(map.size());

		map.compute(4, (k, v) -> {
			System.out.println(k);
			System.out.println(v);

			return 0;
		});

		System.out.println(map.size());
		System.out.println(map);

		Map<Integer, Integer> map2 = new HashMap<>();
		int[] nums = { 9, 8, 7, 7 };
		/*
		 * map2.compute(9, (k, v) -> v == null ? 1 : v + 1); map2.compute(8, (k, v) -> v
		 * == null ? 1 : v + 1); map2.compute(7, (k, v) -> v == null ? 1 : v + 1);
		 * map2.compute(7, (k, v) -> v == null ? 1 : v + 1);
		 */
		for (int num : nums) {
			map2.compute(num, (k, v) -> v == null ? 1 : v + 1);
		}

		System.out.println(map2);
	}
}
