package chpa12.lecture.p01thread;

public class App01 {
	public static void main(String[] args) {

		// 쓰레드 클래스 실행법 2가지 
		// 1.쓰레드의 서브 클래스(run method 재정의) 작성한다.
		// start가 실행되는 순간 동시에 시작이 된다. 
		// Thread 객체 생성 후 start 메소드 실행
		
		// 메인메소드 실행 ->  t1.start(); -> 다른 쓰레드 만들어짐
		Thread t1 = new Thread();
		t1.start();
		
		Thread t2 = new Thread();
		t1.start();
		
		
	}

}
