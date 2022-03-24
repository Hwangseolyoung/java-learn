package chap13.book.example.s130700;

public interface Storage<T> {
	public void add(T item, int index);
	
	public T get(int index);

}
