package chap15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;

public class App02 {
	public static void main(String[] args) {
		// key가 set과 비슷하다.
		Map<Computer, Integer> map =new HashMap<>();
		map.put(new Computer("samsung", "galaxy"), 1);
		map.put(new Computer("lg", "gram"), 5);
		
		System.out.println(map.size());
		
		// 위 객체와 동일하다고 하려면 hashCode와 equals 메소드를 재정의 해줘야 한다.
		// 재정의 하지 않으면 다른 객체로 인식된다.
		map.put(new Computer("samsung", "galaxy"), 10); 
		System.out.println(map.size());
	}

}

class Computer {
	private String company;
	private String model;
	
	
	public Computer(String company, String model) {
		this.company = company;
		this.model = model;
	}


	public String getCompany() {
		return company;
	}


	public String getModel() {
		return model;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
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
		Computer other = (Computer) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	
	
	
	
}
