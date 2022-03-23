package chap11.lecture.p05arrays;

import java.util.Arrays;

public class App01 {
	public static void main(String[] args) {
		// Arrays : 배열 조작에 관련된 static 메소드
		int[] arr1 = {3, 5, 1, 0, 10};
		
		// 배열 정렬
		Arrays.sort(arr1);
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		
		// 배열을 문자열로 변경
//		for(int num : arr1) { // 기존 향상된 for문 사용
//			System.out.println(num);
//		}
		
		System.out.println(Arrays.toString(arr1));
		
		// 배열 복사
		int[] arr2 = Arrays.copyOf(arr1, arr1.length); // 다른 참조값 배열이 생성됨
		arr2[0] = 99; 
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

}
