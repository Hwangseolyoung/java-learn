package chap07.book.exercise.p5;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int StudentNo) {
		// 생성자 호출을 명시적으로 함
		super(name); // 부모의 기본 생성자를 호출하지 않아서 컴파일 에러 발생
//		this.name = name; // 위 메소드와 동일한 일을 함으로 생략 가능
		this.studentNo = studentNo;
	}
	
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	
	public int getStudentNo() {
		return studentNo;
	}
	

}
