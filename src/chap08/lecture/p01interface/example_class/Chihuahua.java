package chap08.lecture.p01interface.example_class;

public class Chihuahua extends Canine implements Pet {
	// 추상메세지 에러가 여러게라면 ctrl + 1 누르면 모든 메소드가 다 만들어짐

	@Override
	public void cry() {
		System.out.println("멍멍");
		
	}
	
	@Override
	public void roll() {
		System.out.println("물어버립니다.");
	}
}
