package chap06.book.example.s060401;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s1 변수가 또 다른 student 객체를 참조합니다.");
	}

}
