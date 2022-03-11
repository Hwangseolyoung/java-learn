package chap06.lecture.p04method;

public class App04 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		// return한 값을 출력하려면 같은 타입의 변수에 담아줘야한다.
		int rec = c1.plus(20, 10); 
		System.out.println(rec);
		System.out.println(c1.plus(30, 40));
	}

}
