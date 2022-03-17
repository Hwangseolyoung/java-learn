package chap08.book.example.s080402;


public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.trunOn();
		rc.setMute(true);
		
		rc = new Audio();
		rc.trunOn();
		rc.setMute(true);
	}

}
