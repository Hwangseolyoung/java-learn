package chap09.book.example.s090502;

public class Button {
	// 중첩 인터페이스
	interface onClickListener {
		void onClick();
	}
	
	// 인터페이스 타입 필드
	onClickListener listener;
	
	// 매개 변수의 다형성
	void setOnClickListener (onClickListener listener) {
		this.listener = listener;
	}
	
	// 구현객체의 메소드 호출
	void touch() {
		listener.onClick();
	}
	
	

}
