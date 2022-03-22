package chap11.lecture.p01object;

public class App04Equals {
	public static void main(String[] args) {
		Desk d1 = new Desk("a01");
		Desk d2 = new Desk("b01");
		Desk d3 = new Desk("a01");
		
		System.out.println(d1 == d2); // 참조값 비교
		System.out.println(d1 == d3); // 참조값 비교
		
		// equals 재정의 하여 true가 나온다.
		// 재정의 하지 않은 상태에선 false
		System.out.println(d1.equals(d3));
		
		// String
		String s1 = new String("java");
		String s2 = new String("java");
		// 같은 문자열을 가지고 있지만 참조값은 다르다.
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
class Desk {
	private String model;
	
	public Desk(String model) {
		this.model = model;
	}
	
	// equals 재정의함
	@Override
	public boolean equals(Object obj) {
		// obj의 model 필드값과
		// this의 model 필드값이 같으면 true
		
		if(obj instanceof Desk) {
			Desk d = (Desk) obj;
			if (d.model.equals(this.model)) {
				return true;
			}
		}
		
		return false;
	}
}
