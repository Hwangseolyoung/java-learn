package chap18.book.example.s180402;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"src/chap18/Book/example/s180402/FileInputStreamExample.java");
			
			int data;
			while((data = fis.read()) != -1) { // 1byte씩 읽고 콘솔에 출력
				System.out.write(data);
			}
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
