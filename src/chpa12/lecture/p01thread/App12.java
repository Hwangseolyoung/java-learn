package chpa12.lecture.p01thread;

public class App12 {
	public static void main(String[] args) {
		// Runnable 익명 객체 이용
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("쓰레드 1 실행");
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("쓰레드 2 실행");
				
			}
		});
		
		t1.start();
		t2.start();
	}

}
