package Chap03.book.example;

public class InputDataCheckNanExample1 {
	public static void main(String[] args) {
		String userInput = "NAN";
		double val = Double.valueOf( userInput );
		
		double currenBalance = 10000.0;
		
		currenBalance += val;
		
		System.out.println(currenBalance);
	}

}
