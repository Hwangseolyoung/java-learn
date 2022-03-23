package chap11.lecture.p03wrapper;

public class App05 {
	public static void main(String[] args) {
		Integer i1 = null; // 인스턴스를 가르키지 않으면 null값을 가질 수 있다.
		int i2 = i1; // auto unboxing은 되나 NullPointerException 발생함
		
		System.out.println("프로그램 실행 계속");
	}

}
