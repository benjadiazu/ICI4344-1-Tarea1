package client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RunClient {
	public static void main(String args[]) throws RemoteException, NotBoundException {
		Client client = new Client();
		client.startClient();
	}
}
