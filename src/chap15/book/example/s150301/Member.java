package chap15.book.example.s150301;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// name과 age 값이 같으면 동일한 hashCode가 리턴
	@Override
	public int hashCode() {
		return name.hashCode() + age; // String의 hashCode 이용
	}
	
	// name과 age 값이 같으면 true를 리턴
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}
	
	
	

}
