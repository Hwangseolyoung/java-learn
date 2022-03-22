package chap06.lecture.p11annotation;

public class App07 {
	@MyAnnotation7(value = "java", price = 300)
	void method() {
		
	}
	// 여러 attribute를 사용할때  작성 순서 상관없으나
	// 생략은 안되고 다 작성해야 한다. 
	@MyAnnotation7(value = "spring", price = 300)  
	void method2() {
		
	}
	
	// 배열 사용시 {} 사용해서 작성
	@MyAnnotation7(value = {"spring", "java"}, price = 300)  
	void method3() {
		
	}
	
	// default값을 지정해서 작성하지 않아도 오류발생하지 않음
	@MyAnnotation7 
	void method4() {
		
	}

}
