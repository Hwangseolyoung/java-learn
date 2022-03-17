package chap08.lecture.p02polymorphism;

import chap08.lecture.p01interface.example_class.*;

public class App05 {
	public static void main(String[] args) {
		Retriever dog = new Retriever();
		Helper helper = dog;
		Pet pet = dog;
		Animal animal = dog;
		
		// 실제 인스턴스의 메소드가 실행된다.
		helper.help();
		pet.roll();
		animal.cry();
		
	}

}
