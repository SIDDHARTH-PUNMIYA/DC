
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	 private Socket socket = null;
	    private DataInputStream input = null;
	    private DataOutputStream out = null;
	public Client(String addr,int port) {
		try {
			socket = new Socket(addr,port);
			System.out.println("CONNECTED");
			input = new DataInputStream(System.in);
			out=new DataOutputStream(socket.getOutputStream());
			
		} catch (UnknownHostException e) {
			System.out.println(e);
			return;
		} catch (IOException e) {
			System.out.println(e);
			return;
		}
		
		
		String line ="";
		
		while(!line.equals("OVER" )) {
			try {
				line=input.readLine();
				out.writeUTF(line);
			} catch (IOException e) {
					System.out.println(e);
			}
		}
		try {
			input.close();
			out.close();
			socket.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
	} 
	public static void main(String[] args) {	
Client c = new Client("127.0.0.1", 5000);
	}
}
