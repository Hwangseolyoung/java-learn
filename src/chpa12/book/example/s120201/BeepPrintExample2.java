package chpa12.book.example.s120201;

public class BeepPrintExample2 {
	// 메인 스레드와 작업 스레드가 동시에 실행
	public static void main(String[] args) { 
		Runnable beepTask = new BeepTask(); 
		Thread thread = new Thread(beepTask);
//		Thread thread = new Thread(new BeepTask()); // 한줄로 작성 가능
		thread.start();
		
		for(int i = 0; i < 5; i++ ) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch ( Exception e) {
				
			}
		}
	}

}
