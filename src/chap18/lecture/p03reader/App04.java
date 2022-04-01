package chap18.lecture.p03reader;

import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;

public class App04 {
	public static void main(String[] args) throws Exception{
		// 캐릭터 배열로 문자를 읽음
		
		String name = "src/chap18/lecture/p03reader/App04.java";
		
		Reader rd = new FileReader(name);
		
		char[] datas = new char[10];
		// 파라미터 없으면 1개의 문자를 읽음
		// 파라미터에 배열 변수가 있으면 그 값만큼 읽음
		rd.read(datas);
		System.out.println(Arrays.toString(datas));
		rd.read(datas);
		System.out.println(Arrays.toString(datas));
		
		
		
		
		rd.close();
		
	}

}
