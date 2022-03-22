package chap11.book.example.s110302;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key comparekey = (Key) obj;
			if(this.number == comparekey.number) {
				return true;
			}
		}
		return false;
	}
	// 메소드를 재정의 하지 않음
	// 이때 해시코드가 다르기 때문에 다른 식별키로 인식한다.
	
	// hashCode() 메소드 재정의 추가함
	@Override
	public int hashCode() {
		return number;
	}

}
