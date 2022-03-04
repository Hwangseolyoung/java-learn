package Chap05.lecture.array;

public class C01Array {
	public static void main(String[] args) {
		// 선언 후 초기화
		int[] arr2;
		arr2 = new int[] {11, 22, 33};
		
		// 배열 선언과 초기화
		int[] arr1 = new int[] {10,20 ,30};
		
		// 배열 선언과 초기화를 동시에 할 경우에만(new 생략)
		int[] arr3 = {99, 88, 77};
		
		// 배열 선언
		int[] arr4;
		
		// 초기값 없이 배열 만들어서 할당(배열의 길이만 지정)
		// 0부터 양수를 넣어주면 됨
		arr4 = new int[5];
		
		arr4[0] = 2;
		arr4[1] = 99;
		arr4[2] = 100;
		
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr1[i]);
		}
		
		// 배열 선언 후 길이만 정해줌
		int[] arr5 = new int[10];
		
		
		
		
	}

}
