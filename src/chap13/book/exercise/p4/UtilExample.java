package chap13.book.exercise.p4;

import chap09.book.example.s090502.main;

public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);
		
		ChildPair<String, Integer> childPair = new childPair<>("홍삼원", 20);
		Integer childAge = Util.getValue(childPair, "홍삼순");
		System.out.println(childPair);
		
		/* OtherPair<String, Integer> otherPair = new OtherPair<>("홍삼원", 20);
		// OtherPair는 Pair를 상속하지 않으므로 예외가 발생해야 합니다. 
		   int OtherAge = Util.getValue(otherPair, "홍삼원");
		   System.out.println(otherAge); */
	}

}
