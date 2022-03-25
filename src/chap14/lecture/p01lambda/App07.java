package chap14.lecture.p01lambda;

public class App07 {
	public static void main(String[] args) {
//		args = null; // final or effectively final
		MyInterface7 o1 = () -> System.out.println(args.length); // 파라미터도 지역변수처럼 사용가능
	}

}


@FunctionalInterface
interface MyInterface7 {
	void method1();
}