import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Java2Server {
	public static void main(String[] args){
		
		int portNumber = 5555;
		int queueLength = 10;
		try{
		ServerSocket server = new ServerSocket(portNumber, queueLength); 
		
		Socket connection = server.accept(); //Accept a connection from a client
		
		//Receive two ints from client
		//sent the two ints to SumTheseTwo, which returns their sum
		//Send the sum to the client.
		connection.getOutputStream();
		connection.getInputStream();
		
		
		
		}
		catch(IOException e){
			e.printStackTrace();
			return;
		}
	}
	
	public int SumTheseTwo(int a, int b){
		int c = a + b;
		
		return c;
	}
}
