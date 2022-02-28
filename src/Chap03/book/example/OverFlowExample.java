package Chap03.book.example;

public class OverFlowExample {
	public static void main(String[] args) {
		// 오버플로우 발생
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);  // -727379968 출력됨 쓰레기값
		
		// 오버플로우 해결
		long x1 = 1000000; // long타입 변환
		long y1 = 1000000;
		long z1 = x1 * y1;
		System.out.println(z1);
	}

}
