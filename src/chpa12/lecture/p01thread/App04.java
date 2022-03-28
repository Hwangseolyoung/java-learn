package chpa12.lecture.p01thread;

public class App04 {
	public static void main(String[] args) {
		// sleep method : static method라 바로 실행 가능함.
		// 현재 쓰레드 실행을 millisecounds 만큼 멈춤
		// try catch 작성 해주기(체크드 익셉션 발생되므로)
		
		System.out.println("쓰레드 실행 중....");
		
		try {
			// sleep 현재 쓰레드 실행을 milliseconds 만큼 멈춤
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("쓰레드 실행 계속..........");
	}

}
