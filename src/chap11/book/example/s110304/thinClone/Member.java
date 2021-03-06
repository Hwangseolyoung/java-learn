package chap11.book.example.s110304.thinClone;

import chap11.book.example.s110304.deepClone.Car;

public class Member implements Cloneable{ // 복제할 수 있다는 표시
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	public Car car;
	
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member getMember() {
		Member cloned = null;
		
		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
		}
		return cloned;
		
	}
	
	

}
