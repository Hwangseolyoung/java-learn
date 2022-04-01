package chap18.lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class App05 {
	public static void main(String[] args) throws Exception {
	String path = "picture/다형성01.png";
	
	InputStream is = new FileInputStream(path);
	
	byte[] datas = new byte[100];
	int len = 0;
	int size = 0;
	
	// read(datas)에 100씩 끝어서 출력하고 
	// -1번째 돌때 그 남은 값을 len에 넣어준다.
	while((len = is.read(datas)) != -1) {
		System.out.println(Arrays.toString(datas));
		size += len;
	}
	System.out.println(size);
	
	}

}
