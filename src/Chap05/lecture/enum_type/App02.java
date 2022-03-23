package Chap05.lecture.enum_type;

public class App02 {
	public static void main(String[] args) {
		Season season = Season.FALL;
		
		
		switch (season) {
		case SPRING:
			System.out.println("봄 입니다.");
			break;
		case SUMMER:
			System.out.println("여름 입니다.");
			break;
		case FALL:
			System.out.println("가을 입니다.");
			break;
		case WINTER:
			System.out.println("겨울 입니다.");
			break;
		default:
			break;
		}
	}

}
