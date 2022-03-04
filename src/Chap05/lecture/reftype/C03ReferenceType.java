package Chap05.lecture.reftype;

public class C03ReferenceType {
	public static void main(String[] args) {
		String s1 =  new String("java");
		String s2 =  new String("java");
		
		System.out.println(s1);
		System.out.println(s2);
		
		// 실제 가지고 있는 주소(값)를 비교함
		System.out.println(s1 == s2); // 값은 다르기 때문에 false
		
		int i1 =3;
		int i2 =3;
		
		// int 참조 값만 비교함
		System.out.println(i1 == i2); // true
	}

}
