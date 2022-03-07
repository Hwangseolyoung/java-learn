package Chap05.lecture.array;

public class C10Array {
	public static void main(String[] args) {
		int[] a = {3, 4, 5, 7};
		int[] b = a; // 참조값이 복사됨
		
		
		b[0] = 9;
		System.out.println(a[0]);
		
		// 1차원 배열을 복사하기(새로운 참조값이 생성됨)
		int[] c = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a [i];
		}
		
		c[0] = 30;
		System.out.println(a[0]);
		System.out.println(c[0]);
	}
}
