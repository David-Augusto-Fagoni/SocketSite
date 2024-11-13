package controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketController {
	// GET / HTTP/1.1\r\nhost: aied.com.br\r\n\r\b
	public void ligacao () throws UnknownHostException, IOException {
		String request = "GET / HTTP/1.1\r\nHost: aied.com.br\r\n\r\n";
		try (Socket socket = new Socket("212.1.209.207",80)) {
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			os.write(request.getBytes());
			socket.shutdownOutput();
			
			int b;
			while (true) {
			  try {
			    if ((b = is.read()) == -1) {
			      break;
			    }
			    System.out.print((char) b);
			  } catch (IOException e) {
			    throw new RuntimeException(e);
			  }	
			}
		}
	}
}
