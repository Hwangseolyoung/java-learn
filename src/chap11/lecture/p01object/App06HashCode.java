package chap11.lecture.p01object;

public class App06HashCode {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		
		String s1 = new String("java");
		String s2 = new String("java");
		
		// 문자열 해시코드는 문자열 기준으로 되어있기 때문에 
		// 같은 해시코드를 가지고 있다.
		System.out.println(s1.hashCode());
		System.out.println(s1.hashCode());
	}

}
