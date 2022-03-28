package chpa12.lecture.p01thread;

public class App02 {
	public static void main(String[] args) {
		// 쓰레드 클래스 실행법 2가지 
		// 1.쓰레드 클래스를 상속받아 쓰레드의 서브 클래스(run method 재정의) 작성한다.
		Thread t1 = new MyThread1();
		t1.start();
		
		// ... 메인 메소드 계속 실행...(MyThread1와 동시에 실행된다.)
		for(int i = 0; i < 10000; i++) { // 2가지가 번갈아가며 동시 실행됨
			System.out.println("메인 쓰레드 계속 실행!!!");			
		}
			
	}

}

class MyThread1 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 10000; i++) {
			System.out.println("thread1 실행 중...");		
		}
	}
}
