package chap06.book.example.s061303.package2; // 패키지가 다름

import chap06.book.example.s061303.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		a.field3 = 1;
		
		a.method1();
		a.method2();
		a.method3();
		
	}

}
