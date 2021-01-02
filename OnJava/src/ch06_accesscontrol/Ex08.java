package ch06_accesscontrol;
import ch06_accesscontrol.test.*;

public class Ex08 {	

	public static void main(String ... args) {	
		System.out.println("\n------------- Inside main() ----------------\n");

		Connection con = ConnectionManager.getFirstConnection();
		while(con != null) {
			System.out.println(con);
			con.doSomething();
			con = ConnectionManager.getNextConnection(con.getConnectionId());
		}
		
		System.out.println("\n------------- End of main ----------------\n");
		
	}
}