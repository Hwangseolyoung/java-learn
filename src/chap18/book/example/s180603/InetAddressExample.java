package chap18.book.example.s180603;

import java.net.InetAddress;
import java.rmi.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) throws UnknownHostException {
		// IP 주소 얻기
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP 주소: " + local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP 주소 : " +remote.getHostAddress());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
