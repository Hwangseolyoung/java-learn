package Chap05.lecture.array;

import java.util.Arrays;

public class C16ArrayCopy {
	// 그림 : 참조타입09.png
	public static void main(String[] args) {
		int[][] a = { { 9, 10 }, { 3, 4 } };
		
		int[][] c = new int[a.length][];
		
		// 배열안의 배열의 내용만 복사 하므로 새로운 참조값이 생성됨
		// 배열에 각각 복사할때 코드
		/*
		c[0] = Arrays.copyOf(a[0], a[0].length);
		c[1] = Arrays.copyOf(a[1], a[1].length);
		*/
		
		// for문을 돌면서 배열의 내용만 복사됨, 참조값은 새롭게 생성됨!
		for (int i = 0; i < a.length; i++) {
			c[i] = Arrays.copyOf(a[i], a[i].length);
		}
		
		c[0][0] = 999;
		System.out.println(a[0][0]);
	}

}
