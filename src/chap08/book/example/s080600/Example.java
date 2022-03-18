package chap08.book.example.s080600;

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		// interfaceA 변수는 methodA()만 호출가능
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		// interfaceB 변수는 methodB()만 호출가능
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		// interfaceC 변수는 모든 메소드 호출가능
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
