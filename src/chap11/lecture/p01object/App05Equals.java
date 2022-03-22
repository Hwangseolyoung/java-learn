package chap11.lecture.p01object;

public class App05Equals {
	public static void main(String[] args) {
		Car car1 = new Car("kia", "k5");
		Car car2 = new Car("kia", "k5");
		
		// true : 만약 car의 company와 model이 같으면
		System.out.println(car1.equals(car2)); 
	}

}

class Car {
	private String company;
	private String model;
	
	public Car(String company, String model) {
		this.company = company;
		this.model = model;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			Car c = (Car) obj;
			if(c.company.equals(this.company) && c.model.equals(this.model)) {
				return true;
			}
		}
		
		return false;
	}
	
	// 강사님 코드	
//		@Override 
//		public boolean equals(Object obj) {

//			if (obj instanceof Car) {
//				Car o = (Car) obj;
//				
//				return this.company.equals(o.company) && this.model.equals(o.model);
//			}
//			
//			return false;
//		}
}
