package chap14.lecture.p01lambda;

public class App06 {
	public static void main(String[] args) {
		// final or effectively final
		// 값이 변경되면 안된다.
		int local = 0;
		MyInterface6 o1 = new MyInterface6() {
			@Override
			public void method1() {
				System.out.println(local);
				
			}
		};
//		local = 4;
		MyInterface6 o2 = () -> System.out.println(local);
	}

}

@FunctionalInterface
interface MyInterface6 {
	void method1();
}