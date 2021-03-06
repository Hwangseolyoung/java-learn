package chap18.book.example.s180404;

import java.io.FileReader;

public class FileReaderExample {
	// 텍스트 파일 읽기
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("src/chap18/book/example/s180404/FileReaderExample.java");
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		
		fr.close();
	}

}
