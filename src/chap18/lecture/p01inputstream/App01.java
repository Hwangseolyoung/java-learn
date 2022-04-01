package chap18.lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class App01 {
	public static void main(String[] args) throws Exception{
		String fileName = "src/chap18/lecture/p01inputstream/App01.java";
		// InputStream : 데이터 입력 처리 클래스
		// 추상클래스여서 인스턴스를 생성할 수 없다.
		// 그래서 FileInputStream으로 생성(다형성)
		// Checked Exception을 발생시키므로 try catch 작성 해야하나
		// throws Exception으로 대체한다.(좋은 습관은 아님)
		InputStream is = new FileInputStream(fileName);
		
		// read : 한바이트를 읽는 메소드
		// 파라미터 변수가 없으면 1개의 문자를 읽음
		// 파라미터에 배열 변수가 있으면 그 값만큼 읽음
		// Integer로 리턴된다.
		int byte1 = is.read();
		int byte2 = is.read();
		int byte3 = is.read();
		
		System.out.println(byte1);
		System.out.println(byte2);
		System.out.println(byte3);
		
		ch
	}

}
