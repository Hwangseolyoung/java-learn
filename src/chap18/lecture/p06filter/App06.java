package chap18.lecture.p06filter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class App06 {
	public static void main(String[] args) throws Exception {
		// BufferedReader, BufferedWriter 사용해서
		// output/FilterExample51.txt 를
		// output/FilterExample6.txt 으로 복사하기
		
		// 원본파일
		String origin = "output/FilterExample51.txt";
		
		// 복사파일
		String copy = "output/FilterExample6.txt";
		
		Reader rd = new FileReader(origin);
		Reader br = new BufferedReader(rd);
		
		Writer writer = new FileWriter(copy);
		Writer bw = new BufferedWriter(writer);
		
		int data = 0;
		
		while((data = rd.read()) != -1) {
			bw.write(data);
		}
		
		System.out.println("복사 완료!!");
		

	}
	
}