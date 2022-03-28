package chpa12.lecture.p01thread;

public class App08 {
	static int shareVar = 0; // 여러 스레드가 공유하는 객체의 값을 사용하지 말아야 한다.
	public static void main(String[] args) {
		Thread t1 = new Thread() { // 클래스 구현과 인스턴스 생성을 동시에
			public void run() {
				for(int i = 0; i < 1000000; i++) {
					shareVar++;
				}
				
				System.out.println("thread81 : " + shareVar);
				
			};
		};
		
		Thread t2 = new Thread() { // 클래스 구현과 인스턴스 생성을 동시에
			public void run() {
				for(int i = 0; i < 1000000; i++) {
					shareVar++;
				}
				
				System.out.println("thread82 : " + shareVar);
				
			};
		};
		
		t1.start();
		t2.start();
	}

}
