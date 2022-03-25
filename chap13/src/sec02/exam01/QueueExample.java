package sec02.exam01;

import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> queue = new LinkedList<Message>();
		
		queue.offer(new Message("sendMail","È«±æµ¿"));
		queue.offer(new Message("sendSMS","½Å¿ë±Ç"));
		queue.offer(new Message("sendKakaotalk","È«µÎ²²"));
		
		while(!queue.isEmpty()) {
			Message message = queue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "´Ô¿¡°Ô ¸ÞÀÏÀ» º¸³À´Ï´Ù.");
				break;
			case "sendSMS":
				System.out.println(message.to + "´Ô¿¡°Ô SMS¸¦ º¸³À´Ï´Ù.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to +"´Ô¿¡°Ô Ä«Ä«¿ÀÅåÀ» º¸³À´Ï´Ù.");
			}
		}
		
	}

}
