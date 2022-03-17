package chap08.book.example.s080301;

import chap08.book.example.s080203.RemoteControl;

public class Audio implements RemoteControl{
	// 필드
	private int volume;

	// trunOn() 추상 메소드의 실체 메소드
	public void trunOn() {
		System.out.println("Audio를 켭니다.");
	}

	// trunOff() 추상 메소드의 실체 메소드
	public void trunOff() {
		System.out.println("Audio를 끕니다.");
	}

	// setVolume() 추상 메소드의 실체 메소드
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}

		System.out.println("현재 Audio 볼륨 : " + this.volume);
		}

}
