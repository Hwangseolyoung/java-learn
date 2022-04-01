package chap18.lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class App03 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/p01inputstream/App03.java";
		
		InputStream is = new FileInputStream(path);
		
		// 배열에 담아서 100byte씩 몇개를 읽었는지 리턴해준다.
		// 앞에 한바이트씩 읽는 read와 출력이 다르다.
		
		byte[] datas = new byte[100];
		
		is.read(datas);
		System.out.println(Arrays.toString(datas));
		
		is.read(datas);
		System.out.println(Arrays.toString(datas));
	}

}
