package chap06.lecture.p04method;

public class Calculator2 {
	// varargs (가변길이 매개변수)
	// 여러개의 인티저를 받을 수 있다.
	// 코드 블럭 안쪽에 배열로 작성한다.
	int sum(int... nums) {
		System.out.println("num의 길이: " + nums.length);
		
		int sum = 0;
		
		for (int num : nums) {
			sum += num;
		}
		
		return sum;
	}
	
	// 가변길이 매개변수는 항상 마지막에 작성
	int varSum(String name, int... nums) {
		return 0;
	}
	
	void concat(String... strs) {
		for(String str : strs) {
			System.out.print(str);
		}
		System.out.println();
	}

}
