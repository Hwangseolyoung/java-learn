package chap18.lecture.p06filter;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class App04 {
	public static void main(String[] args) throws Exception{
		// OutputStreamWriter : 아웃풋스트림을 -> 라이트스트림으로 감싸서 writer로 사용함
		// 쓰고 싶었던 것이 한글 이었다.
		
		String path = "output/FilterStream04.txt";
		OutputStream os = new FileOutputStream(path); 
		Writer writer = new OutputStreamWriter(os);
		
//		os.write('a');
//		os.write('한'); // 한이라는 한글자는 2byte라 제대로 출력되지 않음
		writer.write('b');
		writer.write("글");
		
		writer.close();
		os.close();
	}

}
