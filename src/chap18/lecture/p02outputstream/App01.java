package chap18.lecture.p02outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App01 {
	public static void main(String[] args) {
		// OutputStream 추상클래스 : byte 단위 출력할 때 사용하는 클래스
		
		String fileName = "output/OutputStreamEx01.txt";
		
		try(OutputStream os = new FileOutputStream(fileName);) {
			
			os.write(99); // 1 byte 쓰기(4 byte 중에 1 byte만 쓴다.)
			os.write(99999); // 1 byte 쓰기(4 byte 중에 1 byte만 쓴다.)
			os.write(978787); // 1 byte 쓰기(4 byte 중에 1 byte만 쓴다.)
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		os.close(); // IOException 발생
		System.out.println("프로그램 종료");
	}

}
