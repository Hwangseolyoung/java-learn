package chap18.lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class App06 {
	public static void main(String[] args) {
		// Exception
		// IOException 발생되므로 try cath문을 작성해야함
		String path = "picture/다형성01.png";

		InputStream is = null; // 값을 null;로 초기화 해줘야함
		try {
			is = new FileInputStream(path);

			byte[] datas = new byte[100];
			int len = 0;
			int size = 0;

			while ((len = is.read(datas)) != -1) {
				System.out.println(Arrays.toString(datas));
				size += len;
			}
			System.out.println(size);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try { // IOException 발생되므로 try cath문을 작성해야함
				if (is != null) {
					is.close(); // 꼭 작성
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		// 데이터를 읽고 썼다면 InputStream을 닫는 코드를 작성해야한다.
		// 닫지 않는다면 다른 곳에서 사용하기 힘들다(사용중이라서 사용하기 힘들다)
		// 열었던 곳에서 꼭 작성해야함
		
	
		}
	}

