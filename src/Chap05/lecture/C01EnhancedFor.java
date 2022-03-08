package Chap05.lecture;

public class C01EnhancedFor {
	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			System.out.println("그냥 for");
		}
		
		// 배열 탐색 for문
		int[] arr1 = {100, 200, 300, 400};
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		/* 향상된 for문
		for(아이템 타입과 변수명 : 배열) {
		} 
		 */
		
		for (int item : arr1) {
			System.out.println(item); // 배열의 아이템의 갯수만큼 반복됨
			System.out.println("코드 반복!!");
		}
	}
}