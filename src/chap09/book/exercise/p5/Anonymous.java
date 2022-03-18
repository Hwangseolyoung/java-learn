package chap09.book.exercise.p5;

public class Anonymous {
	//중첩 클래스를 익명 클래스로 재정의
	Vehicle field = new Vehicle() {
		
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
			
		}
	};
	// 지역클래스를 익명 클래스로 재정의
	void method1() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");	
			}
		};
		
		localVar.run();
	}
	
	// 파라미터에 무엇이 들어와도 자동형변환되서 들어온다.
	void method2(Vehicle v) {
		v.run(); 
	}

}
