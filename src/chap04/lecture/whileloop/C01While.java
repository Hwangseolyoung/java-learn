package chap04.lecture.whileloop;

public class C01While {
	public static void main(String[] args) {
		System.out.println("stmt 1");
		
//		boolean condition = true;
		
		int i = 0; // 변수는 시작전에 미리 선언하기
		
		while (i < 3) { // 무한 루프를 돌지 않도록 종료 조건을 넣어야함
			System.out.println("stmt 2");
			System.out.println("stmt 3");
			
			i++; // 증감식은 코드블럭 안에 넣어주기
		}
		
		System.out.println("stmt 4");
	}

}
