package chap04.lecture.forloop;

public class C08For {
	public static void main(String[] args) {
		int[] arr1 = {3, 1, 9, 0, 7};
		
		// arr1에 있는 모든 값을 더해서 출력
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
		}
		
		System.out.println(sum);
		
		// arr1의 값 중 가장 큰 값을 구해서 출력
		int max = arr1[0]; // 첫번째 값을 가장 큰 값이라 가정하고 탐색한다.
		for (int i = 1; i < arr1.length; i++) {
//			max = (max < arr1[i]) ? arr1[i] : max;
			if (max < arr1[i]) { // if문을 사용해서 출력하기
				max = arr1[i];
			}
		}
		
		System.out.println(max);
		
		// arr1의 값 중 가장 작은 값을 구해서 출력
		
		int min = arr1[0];
		
		for (int i = 1; i <arr1.length; i++) {
			min = (min > arr1[i]) ? arr1[i] : min; // 삼항연산식을 사용해서 출력하기
//			if (min > arr1[i]) {
//				min = arr1[i];
//			}
		}
		
		System.out.println(min);
	}
}
