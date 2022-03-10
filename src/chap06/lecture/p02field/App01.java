package chap06.lecture.p02field;

public class App01 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		
		// 각각 다른 인스턴스이기 때문에 
		// 각각의 필드에 값이 각각 저장됨(서로 영향을 받지 않는다.)
		c1.speed = 30;
		c2.speed = 50;
		
		System.out.println(c1.speed);
		System.out.println(c2.speed);
		
		c1.color = "red";
		c2.color = "blue";
		
		c1.model = "model Y";
		c2.model = "avante";
		
	}

}
