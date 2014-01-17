import java.net.ServerSocket;
import java.net.Socket;


public class Java2Server {
	public static void main(String[] args){
		
		int portNumber = 5555;
		int queueLength = 10;
		
		ServerSocket server = new ServerSocket(portNumber, queueLength); 
		Socket connection = server.accept();
		
		connection.getOutputStream();
		connection.getInputStream();
		
		
	}
	
	public int SumTheseTwo(int a, int b){
		int c = a + b;
		
		return c;
	}
}
