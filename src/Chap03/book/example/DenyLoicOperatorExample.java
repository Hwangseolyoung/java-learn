package Chap03.book.example;

public class DenyLoicOperatorExample {
	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
	}

}
