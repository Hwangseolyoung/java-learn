package chap07.lecture.p06polymorphism;

import chap07.lecture.p99polymorphism_class.Animal;
import chap07.lecture.p99polymorphism_class.Chihuahua;
import chap07.lecture.p99polymorphism_class.StreetCat;

public class App09 {
	public static void main(String[] args) {
		// 강제 형변환
		Animal animal = new StreetCat();
		animal.breathe();
		animal.cry();
		
		// angry 메소드를 실행
		Chihuahua chihuahua  = (Chihuahua) animal; // ClassCastException 발생
		chihuahua.angry();
		
		// 강제 형변환(casting)는 매우 주의해서 작성해야함.
		
		System.out.println("명령문 계속 진행");
	}

}
