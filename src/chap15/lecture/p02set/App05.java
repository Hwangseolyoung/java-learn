package chap15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class App05 {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		// String은 equals()가 재정의 되어있기 때문에 중복제거 됬음
		set1.add(new String("java")); 
		set1.add(new String("java"));
		System.out.println(set1);
		
		Set<Car> set2 = new HashSet<>(); 
		// 내가 만든 Car는 equals()가 재정의 되어 있지 않음
		// Car class에서 hashCode(), equals() 재정의 해야함
		set2.add(new Car("tesla"));
		set2.add(new Car("tesla"));
		System.out.println(set2.size()); // 2개
		System.out.println(set2);
		
	}

}

class Car {
	private String model;
	
	Car(String model) {
		this.model = model;
	}
	
	

	@Override
	public String toString() {
		return "Car [model=" + model + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	
	
}