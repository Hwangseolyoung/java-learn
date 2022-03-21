package chap10.book.example.s100300;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class Clazz = Class.forName("java.lang.String2");
			
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다. ");
			
		}
		
	}

}
