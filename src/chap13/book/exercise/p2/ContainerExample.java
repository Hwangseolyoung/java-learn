package chap13.book.exercise.p2;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String> container1 = new Container<String>();
		container1.setContainer("홍길동");
		String str = container1.getContainer();
		
		Container<Integer> container2 = new Container<Integer>();
		container2.setContainer(6);
		int value = container2.getContainer();		
	}

}
