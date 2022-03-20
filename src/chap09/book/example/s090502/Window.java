package chap09.book.example.s090502;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	// 필드 초기값으로 대입
	Button.onClickListener listener = new Button.onClickListener() {
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	Window() {
		// 매개값으로 필드 대입
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.onClickListener() {
			// 매개값으로 익명 구현객체 대입			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
			}
		});
	}
	

}
