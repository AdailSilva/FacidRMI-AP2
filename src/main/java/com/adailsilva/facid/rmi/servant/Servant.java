package com.adailsilva.facid.rmi.servant;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.adailsilva.facid.rmi.service.InputService;

public class Servant extends UnicastRemoteObject implements InputService {
	
	private static final long serialVersionUID = -2847350634315944659L;

	public Servant() throws RemoteException {
		super();
	}

	public String exibir(String input) throws RemoteException {
		
		return "Lado do Servidor: " + input;
	}

}
