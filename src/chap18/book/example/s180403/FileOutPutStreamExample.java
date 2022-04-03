package chap18.book.example.s180403;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutPutStreamExample {
	public static void main(String[] args) throws Exception {
		String originalFileName = "picture/참조타입01.png";
		String targetFileName =  "output/참조타입01_copy.png";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다. ");
	}

}
