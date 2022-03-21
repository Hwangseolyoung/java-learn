package chap10.book.example.s100800;

import chap10.book.example.s100701.BalanceInsufficientException;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		// 예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		
		// 출금하기
		try {
			account.withdraw(30000);
		} catch(BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message); // 예외 메세지 얻기
			System.out.println();
			e.printStackTrace(); // 예외 후 출력
		}
	}

}
