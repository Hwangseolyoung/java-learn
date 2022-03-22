package chap11.book.example.s110302;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 매개값이 Member 타입인지 확인
		if (obj instanceof Member) {
			// Member타입으로 강제 타입 변환하고
			// id 필드값이 동일한지 검사 후 
			// 동일하다면 true를 리턴
			Member member = (Member) obj;
			if(id.contentEquals(member.id)) {
				return true;
			}
		}
		// 매개값이 Member 타입이거나 
		// id 필드값이 다른 경우 false를 리턴
		return false;
	}
	
	// hashCode() 메소드 재정의 추가
	// id가 동일한 문자열인 경우 같은 해시 코드를 리턴
	@Override
	public int hashCode() {
		return id.hashCode();
	}

}

