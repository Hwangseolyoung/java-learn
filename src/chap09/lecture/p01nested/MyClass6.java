package chap09.lecture.p01nested;

public class MyClass6 {
	int outField1;
	void outMethod1() {
		
	}
	
	void method1() {
		class LocalClass {
			int outField1;
			
			void outMethod1() {
				
			}
			
			void method1() {
				outField1 = 3;
				this.outField1 = 3;
				// 로컬 클래스에서 바깥 인스턴스에 접근하는 법
				MyClass6.this.outField1 = 3;
				
				outMethod1();
				this.outMethod1();
				// 로컬 클래스에서 바깥 메소드에 접근하는 법
				MyClass6.this.outMethod1();
			}
		}
	}

}
