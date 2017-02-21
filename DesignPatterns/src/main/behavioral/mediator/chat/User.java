package main.behavioral.mediator.chat;

/**
 * The User sends a message to all other users through the ChatRoom.
 * 
 * @author Sophie
 *
 */
public class User {
	private String name;

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void sendMessage(String message) {
		ChatRoom.showMessage(this, message);
	}
}
