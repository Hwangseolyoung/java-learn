package Chap05.book.exercise;

public class Exercise07 {
	public static void main(String[] args) {
		// 배열의 최대값 찾기
		// 배열의 값이 음수이면 최대값은 -1이 된다.
		// 음수일 경우 max의 값을 -1로 넣어도되고 Integer.MIN 
		
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		System.out.println("max: " + max);
	}

}
