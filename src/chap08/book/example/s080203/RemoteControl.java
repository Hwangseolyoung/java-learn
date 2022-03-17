package chap08.book.example.s080203;

public interface RemoteControl {
	// 상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상메소드
	// 메소드 선언부만 작성함(코드블럭x)
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	

}
