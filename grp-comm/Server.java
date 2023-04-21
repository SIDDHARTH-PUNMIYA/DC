import java.rmi.*;
import java.rmi.registry.*;
public class Server {

	public static void main(String[] args) {
		  try {
			Application stub = new ApplicationRemote();
			Naming.rebind("rmi://localhost:5000/calc", stub);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
	}

}
