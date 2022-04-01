package chap18.lecture.p05file;

import java.io.File;

public class App02 {
	public static void main(String[] args) {
		String path = "output/참조타입01_copy.png";
		File file1 = new File(path);
		
		// exists : file이 존재하는가
		System.out.println(file1.exists()); //true
		
		// delete : file 지우기
		file1.delete();
		
		System.out.println(file1.exists()); // false
		
		// mkdir : 1개의 폴더 생성
		path = "output/other";
		File file2 = new File(path);
		
		file2.mkdir();
		
		// mkdirs : 여러 폴더 생성 
		path = "output/other1/other2/other3";
		File file3 = new File(path);
		file3.mkdirs();
	}

}
