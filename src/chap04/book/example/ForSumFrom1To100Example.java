package chap04.book.example;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum += i; 
		}
//		sum += 1;
//		sum += 2;
//		sum += 3;
//		sum += 4;
//		sum += 5;
//		...
//		
//		sum += 100;
		
		System.out.println("1~100 합 : " + sum);
	}

}
