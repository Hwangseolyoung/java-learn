package chap08.book.example.s080204;

public interface RemoteControl {
	// 상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 디폴트 메소드  
	// 실행 내용까지 작성할 수 있다.
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리 합니다.");
		} else {
			System.out.println("무음 해제 합니다.");
		}
	}

}
