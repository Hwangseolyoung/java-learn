package chap04.lecture.forloop;

public class C03For {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println(i); // 변수명 그대로 사용 가능함
		}
		int i; // for문 종료 후에도 사용하기 원할 때 for문 이전에 선언해준다.
		for (i = 0; i < 5; i++) {
			System.out.println(i); // 선언된 코드블럭 안에 같은 이름의 변수 사용가능
		}
	}

}
