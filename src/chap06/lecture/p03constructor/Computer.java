package chap06.lecture.p03constructor;

public class Computer {
	String cpu;
	String ram;
	String ssd;
	
	// 생성자는 여러개 작성가능
	// 생성자의 파라미터 수, 타입, 순서가 달라야함
	// 동시에 선택해서 같은 인스턴스의 값을 가질 수 없다.
	// 빼야할 내용이 있다면 새로 만들어야 한다. 
	Computer(String cpu, String ram, String ssd) {
		this.cpu = cpu;
		this.ram = ram;
		this.ssd = ssd;
	}
	
	Computer(String cpu, String ram) {
		this.cpu = cpu;
		this.ram = ram;
	}
	
	/* 수와 타입이 같으므로 오류발생
	Computer(String ram, String ssd) {
		this.cpu = ram;
		this.ram = ssd;
	}
	*/
	
	Computer(String cpu) {
		this.cpu = cpu;
	}
	
	// 파라미터 수는 같지만 타입이 다르다면 가능하다.
	Computer(int price) {
		
	}
	
	Computer(String cpu, int price) {
		
	}
	
	// 수와 타입이 같지만 순서가 다르면 가능함
	Computer(int price, String cpu) {
		
	}
}
