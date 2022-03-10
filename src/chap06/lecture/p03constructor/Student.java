package chap06.lecture.p03constructor;

public class Student {
	String name;
	int number;
	
	// 생성자 만들기
	// 클래스명과 생성자명이 같다.
	// 생성자는 new연산자와 함께 사용된다.
	Student(String name, int number) {
		this.name = name;
		this.number = number;
	}
}
