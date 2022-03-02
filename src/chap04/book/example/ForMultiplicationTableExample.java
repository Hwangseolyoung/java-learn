package chap04.book.example;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		// 2단 ~ 9단
		for (int m = 2; m <= 9; m++) {
			
			System.out.println("*** " + m + "단" + " ***");
			
			for (int n = 1; n <= 9; n++) {
				
				System.out.println(m + " X " + n + " = " + (m * n));
			}
		}
		
		// 9단 ~ 2단
		System.out.println("###### 9단 ~ 2단 ######");
		for (int i = 9; i >= 2; i--) {
			System.out.println("*** " + i + "단" + " ***");
			
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
		
		// 9 x 9 = 81 ~ 2 x 1 = 2
		System.out.println("###### 9 x 9 = 81 ~ 2 x 1 = 2 ######");
		
		for (int i = 9; i >= 2; i--) {
			System.out.println("*** " + i + "단" + " ***");
			
			for (int j = 9; j >= 1; j--) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
		
	}

}
