package chap18.book.example.s180502;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception {
		
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("picture/다형성01.png");
		
		start = System.currentTimeMillis();
		while(fis1.read() != -1) { }
		end = System.currentTimeMillis();
		
		System.out.println("사용했을때 : " + (end - start) + "ms");
		
		fis1.close();
		
		// 버퍼 스트림 생성
		FileInputStream fis2 = new FileInputStream("picture/다형성01.png");
		
		BufferedInputStream bis = new BufferedInputStream(fis2);
		
		start = System.currentTimeMillis();
		while(bis.read() != -1) { }
		end = System.currentTimeMillis();
		
		System.out.println("사용했을때 : " + (end - start) + "ms");
		
		bis.close();
		fis2.close();
		
	}

}
