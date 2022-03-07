package Chap05.lecture.array;

import java.util.Arrays;

public class C14ArrayCopy {
	public static void main(String[] args) {
		int[][] a = { { 3, 5 }, { 10, 11, 12 }, { 20, 10 } };
		
		int[][] b = Arrays.copyOf(a, a.length);
		b[0][0] = 99;
		System.out.println(a[0][0]);
		
		// 배열안의 배열의 내용만 복사 하므로 새로운 참조값이 생성됨
		// for문으로 배열 탐색 후 복사해주기
		int[][] c = new int[a.length][]; // a배열의 길이만큼만 복사하므로 값은 null
		
		// 그다음 for문을 돌면서 배열의 내용만 복사됨, 참조값은 새롭게 생성됨!
		for (int i = 0; i < a.length; i++) { 
			c[i] = Arrays.copyOf(a[i], a[i].length);
		}
		
		c[0][0] = 999;
		System.out.println(a[0][0]);
	}

}
