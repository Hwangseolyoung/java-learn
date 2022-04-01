package chap18.lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class App02 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/p01inputstream/App02.java";
		InputStream is = new FileInputStream(path);
		
		// read()는 더이상 읽을 수 없을때는 -1을 리턴해준다.
		int read = 0;
		int cnt = 0;
		// 마지막 작업이 -1이 아닐때까지 read()가 작업함
		while((read = is.read()) != -1) {
//			System.out.println(read);
			cnt++;
		}
			System.out.println(cnt);
	}
}
