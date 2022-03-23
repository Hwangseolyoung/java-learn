package chap11.lecture.p03wrapper;

public class App07 {
	public static void main(String[] args) {
		// String을 기본타입(또는 wrapper class)로 변경
		// wrapper class의 static 메소드 parse...
		// wrapper class의 static 메소드 valueOf()
		
		String s1 = "365";
		
		int i1 = Integer.parseInt(s1); // int <- int, boxing unboxing이 일어난 것이 아니다.
		Integer i2 = Integer.valueOf(s1); // int <- int, boxing unboxing이 일어난 것이 아니다.
		
		int i3 = Integer.parseInt(s1); // auto unboxing
		Integer i4 = Integer.valueOf(s1); // auto boxing
		
		
	}

}
