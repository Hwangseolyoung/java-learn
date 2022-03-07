package Chap05.lecture.array;

import java.util.Arrays;

public interface C11ArrayCopy {
	public static void main(String[] args) {
		int[] a = {9, 5, 2, 1};
		int[] b = new int[a.length];
		
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		
		// 배열 복사 함수 Arrays.copyOf(원본배열, 배열의 길이)
		int[] c = Arrays.copyOf(a, a.length);
		
		
		// System.arraycopy 함수
		int[] d = new int[a.length];
		System.arraycopy(a,  0,  d,  0,  a.length);
 	}

}
