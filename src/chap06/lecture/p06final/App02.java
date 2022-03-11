package chap06.lecture.p06final;

public class App02 {
	// 인스턴스 필드
	int i = 3;
	final int j = 5;
	final int k;
	
	// final로 선언만 하고 값을 할당하지 않았다면
	// 생성자로 값을 한번만 줄 수 있지만 재할당은 안됨
	App02() {
		k = 30;
	}
	
	public static void main(String[] args) {
		App02 o1 = new App02();
		System.out.println(o1.i);
		o1.i = 4;
//		o1.j = 6;  // xxx
//		o1.k = 60; // xxx
		System.out.println(o1.i);
		
	}

}
