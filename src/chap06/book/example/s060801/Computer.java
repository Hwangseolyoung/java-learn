package chap06.book.example.s060801;

public class Computer {
	int sum1(int[] values) {
		int sum = 0;
		for(int i= 0; i < values.length; i++) {
			sum += values[i];
		}
		
		return sum;
		
	}
	
	// 매개 변수의 수를 모를 경우
	int sum2(int ... values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		
		return sum;
	}

}
