package chap09.book.example.s090400;

import chap09.book.example.s090400.ButtonExample.OnClickListener;

public class Button {
	// 중첩 인터페이스
		interface OnClickListener {
			void onClick();
		}
		
		// 인터페이스 타입 필드
		OnClickListener listener;
		
		// 매게 변수의 다형성
		void setOnClickListener(OnClickListener listener) {
			this.listener = listener;
		}
		
		// 구현객체의 onClick() 메소드호출
		void touch() {
			listener.onClick();
		}
		


}
