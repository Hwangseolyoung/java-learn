package chap18.lecture.p07network;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class App01Server {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.25.5", 38080));
		
		System.out.println("[연결 기다림]");
		// accept 클라이언트에게 요청이 오길 기다리고 있는 상태 
		// 연결 성공으로 socket이 만들어짐
		Socket socket = serverSocket.accept();
		System.out.println("[서버쪽 소켓 생성됨]");
		
		OutputStream os = socket.getOutputStream();
		Writer wr = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(wr);
		
		bw.write("클라이언트님 반갑습니다.");
		
		bw.close();
		wr.close();
		os.close();
		
		
		System.out.println("프로그램 실행 종료");
	}

}
