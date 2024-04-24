package common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface InterfazDeServer extends Remote{
	ArrayList<Persona> getPersonas()throws RemoteException;
	void Persona (String nombre, int edad)throws RemoteException;
}
