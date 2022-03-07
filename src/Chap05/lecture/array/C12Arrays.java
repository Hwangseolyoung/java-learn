package Chap05.lecture.array;

import java.util.Arrays;

public class C12Arrays {
	public static void main(String[] args) {
		int[] a = {-1, 9, 2, 3, 10};
		System.out.println(a);
		System.out.println(Arrays.toString(a)); // 배열의 내용을 출력해줌
		
		Arrays.sort(a); // 배열을 작은 숫자 순으로 정리해줌
		System.out.println(Arrays.toString(a));
		
		int[] b = new int[10];
		for(int i = 0; i < b.length; i++) {
			b[i] = 5;
		}
		
		Arrays.fill(b,  5);
		System.out.println(Arrays.toString(b));
 	}

}
