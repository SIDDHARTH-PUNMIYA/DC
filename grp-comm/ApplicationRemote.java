import java.rmi.*;
import java.rmi.server.*;

public class ApplicationRemote extends UnicastRemoteObject implements Application{

	ApplicationRemote() throws RemoteException {
		super();
		
	}

	@Override
	public int add(int x, int y) {
		
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		return x-y;
	}

	@Override
	public int mult(int x, int y) {
		return x*y;
	}

	@Override
	public int div(int x, int y) {
		return x/y;
	}
	
}