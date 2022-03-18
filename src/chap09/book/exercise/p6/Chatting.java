package chap09.book.exercise.p6;

public class Chatting {
	void startChat(String chatId) {
		String nickName = null; 
//		nickName = chatId; // 값을 재할당 할수 없음
		
		Chat chat = new Chat() {
			@Override
			public void start() {
				while (true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
		};
		
		chat.start();
	}

	class Chat {
		void start() {
			
		}
		void sendMessage(String message) {
			
		}

	}
}

