package chap14.book.example.s140402;

public class UsingLocalVariable {
	void method(int arg) { // arg는 final 특성을 가짐
		int localVar = 40; // arg는 final 특성을 가짐
		
//		arg = 31;
//		localVar = 41;
		
		// 람다식
		MyFuncionalInterface fi = () -> {
			// 로컬변수 읽기
			System.out.println("avg : " + arg);
			System.out.println("localVar : " + localVar + "\n");
		};
		fi.method();
		
		
	}

}
