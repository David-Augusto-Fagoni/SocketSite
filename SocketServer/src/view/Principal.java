package view;

import java.io.IOException;

import controller.SocketController;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SocketController s = new SocketController();
		try {
			s.ligacao();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
