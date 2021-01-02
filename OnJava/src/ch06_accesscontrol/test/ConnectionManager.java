package ch06_accesscontrol.test;

public class ConnectionManager {
	private static int connectionsQuantity = 10;
	private static Connection[] connections = new Connection[connectionsQuantity];
		static {
					for(int i = 0; i < connectionsQuantity; i++){
						connections[i] = new Connection();
					}
				}
		
	public static Connection getFirstConnection(){
		return connections[0];
	}

	public static Connection getLastConnection(){
		return connections[connectionsQuantity-1];
	}

	public static Connection getNextConnection(int currentConnectionId) {
		if (currentConnectionId < (connectionsQuantity - 1))
			return connections[currentConnectionId + 1];
		System.out.println("Unfortunately, there is no more connections in the pool");
		return null;
	}

	public static Connection getPreviousConnection(int currentConnectionId) {
		if (currentConnectionId > 0)
			return connections[currentConnectionId - 1];
		System.out.println("Unfortunately, there is no more connections in the pool");
		return null;
	}
		
}