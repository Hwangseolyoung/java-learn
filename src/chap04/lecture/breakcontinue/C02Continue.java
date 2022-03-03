package chap04.lecture.breakcontinue;

public class C02Continue {
	public static void main(String[] args) {
		
		System.out.println("stmt 1");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("stmt 2");
			if (true) {
				continue; // 다음 코드블럭은 실행시키지 않고 위로 올라간다.				
			}
			System.out.println("stmt 3");
		}
		
		System.out.println("stmt 4");
		
	}

}
