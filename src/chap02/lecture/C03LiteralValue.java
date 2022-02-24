package chap02.lecture;

public class C03LiteralValue {
	public static void main(String[] args) {
		
		// 정수 literal
		System.out.println(10);
		
		// 실수 literal
		System.out.println(3.14);
		System.out.println(0.1);
		System.out.println(1.123534);
		
		// 문자 literal (하나의 문자)
		System.out.println('a');
		System.out.println('b');
		System.out.println('A');
//		System.out.println('AB'); x
//		System.out.println('');  x
		System.out.println(' '); // 스페이스
		System.out.println('가');
		System.out.println('0');
		System.out.println(); // 빈 줄 출력
		System.out.println('나');
		
		// 문자열 literal (0개 이상의 문자 나열)
		System.out.println("");
		System.out.println("A");
		System.out.println("ABC");
		System.out.println("가나다");
		System.out.println("😍😊😍");  // 이모지 win + .
		System.out.println("Hello World!!#%$");
		System.out.println("Hello\tWorld"); // \t 탭
		System.out.println("Hello\nWorld"); // \n 탭
		System.out.println("I'm ronman");
		System.out.println("I am \"ironman\""); // \"
		System.out.println("backslash \\");
		
		// 논리(boolean) literal (true, false)
		System.out.println(true);
		System.out.println(false);	
		}
}
