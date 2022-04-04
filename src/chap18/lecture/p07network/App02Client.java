package chap18.lecture.p07network;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;

public class App02Client {
	public static void main(String[] args) throws Exception{
		// 클라이언트가 서버에게 데이터 보내기
		Socket socket = new Socket();
		socket.connect(new InetSocketAddress("192.168.25.5", 38080), 5000);
		
		OutputStream os = socket.getOutputStream();
		Writer wr = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(wr);
		
		System.out.println("[서버로 메세지 전송]");
		bw.write("서버님 반갑습니다.");
		bw.newLine();
		
		bw.close();
		wr.close();
		os.close();
		socket.close();
		

		if(socket != null) {
			socket.close();
		}
		
		System.out.println("클라인트 프로그램 종료");
	}

}
