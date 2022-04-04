// 한글
package chap18.lecture.p06filter;

import java.io.FileInputStream;
import java.io.InputStream;


public class App01 {
	public static void main(String[] args) throws Exception {
		String path ="src/chap18/lecture/p06filter/App01.java";
		
		InputStream is = new FileInputStream(path);
		
		int b1 = is.read();
		int b2 = is.read();
		
		// 한글은 1byte로 표현이 안되서 제대로 읽지 못함
		int b3 = is.read();
		int b4 = is.read();
		
		// 영문은 1byte로 표현이 되서 char로 변환가능
		System.out.println((char) b1);
		System.out.println((char) b2);
		
		// 한글은 1byte로 표현이 안되서 제대로 읽지 못함
		System.out.println((char) b3);
		System.out.println((char) b4);
		
		// try catch 작성하지 않으면 필수 작성
		is.close();
	}

}
