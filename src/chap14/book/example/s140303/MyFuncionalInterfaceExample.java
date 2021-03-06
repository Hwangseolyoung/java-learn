package chap14.book.example.s140303;

public class MyFuncionalInterfaceExample {
	public static void main(String[] args) {
		MyFuncionalInterface fi;
		
		fi = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(2);
		
		fi = (x) -> {
			System.out.println(x * 5);
		};
		fi.method(2);
		
		// 매개 변수가 하나일 경우에는 괄호()를 생략할 수 있다.
		fi = x -> System.out.println(x * 5);
		fi.method(2);
		
	}
}
