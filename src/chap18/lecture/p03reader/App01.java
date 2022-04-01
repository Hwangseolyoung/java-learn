package chap18.lecture.p03reader;

import java.io.FileReader;
import java.io.Reader;

public class App01 {
	public static void main(String[] args) throws Exception{
		// Reader : 문자 단위 입력 스트림
		// 추상클래스 인스턴스 생성 못함
		// 상속 클래스를 사용하여 인스턴스 생성하기
		
		String name = "src/chap18/lecture/p03reader/App01.java";
		
		Reader rd = new FileReader(name);
		
		int ch1 = rd.read(); // p
		int ch2 = rd.read(); // a
		int ch3 = rd.read(); //c
		
		// 더이상 읽을게 없으면 -1을 리턴함
		System.out.println((char) ch1);
		System.out.println((char) ch2);
		System.out.println((char) ch3);
				
		rd.close();
	}

}
