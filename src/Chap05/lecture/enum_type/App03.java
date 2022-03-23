package Chap05.lecture.enum_type;

import static Chap05.lecture.enum_type.Season.*;

public class App03 {
	public static void main(String[] args) {
		Season season1 = Season.WINTER;
		Season season2 = Season.SPRING;
		
		// import static으로 type명 생략 가능함
		Season season3 = SPRING;
		Season season4 = SUMMER;
		
	}

}
