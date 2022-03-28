package chpa12.lecture.p01thread;

import java.awt.Toolkit;

public class App06 {
	public static void main(String[] args) {
		Thread t1 = new MyThread61();
		Thread t2 = new MyThread62();
		
		t1.start(); // 소리실행
		t2.start(); // 텍스트 출력
		
		System.out.println("메인 메소드 실행계속....");
		
	}

}

class MyThread61 extends Thread {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
				
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread62 extends Thread {
	@Override
	public void run() {
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띠링");
				
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
