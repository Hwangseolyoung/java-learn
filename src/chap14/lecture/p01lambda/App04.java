package chap14.lecture.p01lambda;

public class App04 {

}

// functional interface : 추상 메소드가 1개인 인터페이스
@FunctionalInterface
interface MyInterface41 {
	void method1();
}

//@FunctionalInterface  // 추상메소드가 2개 xxx 
interface MyInterface42 {
	void method1();
	void method2();
}
//@FunctionalInterface  // 추상메소드가 없어서 xxx
interface MyInterface43 {
	
}