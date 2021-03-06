package chap18.book.exercise.p7;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		// 정확한 경로로 수정하세요
		String filePath = "src/chap18/book/example/s180502/BufferedReaderExample.java";
		
		// 작성 위치
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int num = 0;
		String line = "";
		
		while((line = br.readLine()) != null) {
			num++;
			System.out.println(num + ": " + line);
			
		}
		
		br.close();
		fr.close();
	}

}
