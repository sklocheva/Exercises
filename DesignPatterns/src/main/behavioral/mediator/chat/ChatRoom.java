package main.behavioral.mediator.chat;

import java.util.Date;

/**
 * The ChatRoom handles all the send messages.
 * 
 * @author Sophie
 *
 */
public class ChatRoom {

	public static void showMessage(User user, String message) {
		System.out.printf("%s [%s] %s", new Date().toString(), user.getName(), message);
	}
}
