package chap18.lecture.p06filter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class App03 {
	public static void main(String[] args) throws Exception{
		String path = "output/FilterExample51.txt";
		normalReader(path);
		bufferedReader(path);
	}
	
	private static void bufferedReader(String path) throws Exception {
		Reader rd = new FileReader(path);
		Reader br = new BufferedReader(rd);
		
		int data = 0;
		
		// 읽는데 걸리는 시간을 체크해줌 
		long start = System.currentTimeMillis();
		while((data = rd.read()) != -1) {
//			System.out.println();
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		
		// 가장 바깥쪽 부터 차례대로 닫아준다.
		br.close();
		rd.close();
	}
	
	private static void normalReader(String file) throws Exception {
		Reader rd = new FileReader(file);
		
		int data = 0;
		
		long start = System.currentTimeMillis();
		while((data = rd.read()) != -1) {
//			System.out.println();
		}
		
		long end = System.currentTimeMillis();
		
		// 버퍼드 리더
		// 처리할때 걸리는 시간을 줄여줌
		
		System.out.println(end - start);
		
		rd.close();
	}

}
