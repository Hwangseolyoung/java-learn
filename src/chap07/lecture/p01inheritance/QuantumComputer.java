package chap07.lecture.p01inheritance;

public class QuantumComputer extends Computer {
	// 상속을 해준 클래스를 super class, parent class라고 한다.
	// 상속을 받은 클래스는 sub class, child class라고 한다.
	
	/*
	// 필드
	public String cpu;
	public String ram;
	public String ssd;

	// 생성자

	// 메소드
	public void executeGame() {
		System.out.println("게임을 실행합니다.");
	}
	*/
	
	public void executeQuantum() {
		System.out.println("복잡한 연산을 합니다");
	}

}
