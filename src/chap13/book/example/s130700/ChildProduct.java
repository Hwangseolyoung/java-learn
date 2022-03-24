package chap13.book.example.s130700;

public class ChildProduct<T, M, C> extends Product<T, M> {
	private C company;
	
	public C getCoompany() {
		return this.company;
	}
	
	public void strCompany(C company) {
		this.company = company;
	}

	public void setkind(chap13.book.example.s130700.Tv tv) {
		// TODO Auto-generated method stub
		
	}

	public void setCompany(String string) {
		// TODO Auto-generated method stub
		
	}
	

}
