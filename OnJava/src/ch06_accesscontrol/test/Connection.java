package ch06_accesscontrol.test;

public class Connection {
	private static int connectionsQuantity = 0;
	private int connectionId = connectionsQuantity++;

	Connection() {}

	public String toString() {
		return "Connection ID - " + connectionId;
	}

	public int getConnectionId() {
		return connectionId;
	}
	public void doSomething() {
		System.out.println("Connection with ID - " + connectionId + " doing something");
	}
}