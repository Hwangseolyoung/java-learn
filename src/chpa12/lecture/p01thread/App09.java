package chpa12.lecture.p01thread;

import java.util.concurrent.atomic.AtomicInteger;

public class App09 {
	// AtomicInteger 
	// int 자료형을 갖고 있는 wrapping 클래스
	// 멀티쓰레드 환경에서 작업 동시성을 보장
	static AtomicInteger shareVar = new AtomicInteger(0); 
	public static void main(String[] args) {
		Thread t1 = new Thread() { 
			public void run() {
				for(int i = 0; i < 1000000; i++) {
					shareVar.incrementAndGet();
				}
				
				System.out.println("thread81 : " + shareVar.get());
				
			};
		};
		
		Thread t2 = new Thread() { // 클래스 구현과 인스턴스 생성을 동시에
			public void run() {
				for(int i = 0; i < 1000000; i++) {
					shareVar.incrementAndGet();
				}
				
				System.out.println("thread82 : " + shareVar.get());
				
			};
		};
		
		t1.start();
		t2.start();
	}

}