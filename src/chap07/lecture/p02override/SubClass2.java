package chap07.lecture.p02override;

public class SubClass2 extends SuperClass2 {
	
	@Override
	public void method1() {
		// super : 상위 클래스 멤버에 접근하기 위해 사용
		// 접근 제한자가 private이면 접근 못함
		// 순서는 중요하지 않는다.
		super.method1(); 
		System.out.println("슈퍼클래스의 메소드1이 하는 일..");
		
		System.out.println("또 다른 일... ");
	}

}
