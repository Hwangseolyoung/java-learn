package chap06.lecture.p03constructor;

public class Desk {
	int weight;
	String color;
	
	// 생성자
	// 생성자명은 클래스명과 같다. 
	// 생성자는 여러개 작성될 수 있다. 
	// 생성자를 작성하지 않으면 기본생성자(파라미터 없는 생성자)가 자동으로 만들어진다.
	// 생성자를 작성하면 기본생성자(파라미터 없는 생성자)는 자동으로 만들어지지 않는다.
	
	Desk() {
		// 중괄호 안에 필드를 초기화하는 값을 작성 한다.
		weight = 1000;
		color = "green";
	}
	
	Desk(int w, String c) {
		weight = w;
		color = c;
	}
}
