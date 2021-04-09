package com.adailsilva.facid.rmi.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.adailsilva.facid.rmi.servant.Servant;

public class ServerRMI {

	public static void main(String[] args) throws RemoteException {

		Registry registry = LocateRegistry.createRegistry(5099);

		registry.rebind("urifacid", new Servant());
		
		System.out.println("Servidor Pronto!");

	}

}
