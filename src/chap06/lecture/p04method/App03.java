package chap06.lecture.p04method;

public class App03 {
	public static void main(String[] args) {
		Computer c1 = new Computer();
		c1.execute("game");
		c1.execute("excel");
		
		c1.update("calculator");
		c1.update("window");
		
		c1.add(3, 5);
		c1.add(10, 20);
//		c1.add(3.14, 1.0); // 같은 타입끼리 넣어줘야함
		c1.add('c', 'a'); // char 타입은 자동 형변환 된다.
	}

}
