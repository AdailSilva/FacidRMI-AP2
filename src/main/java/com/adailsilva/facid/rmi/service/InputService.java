package com.adailsilva.facid.rmi.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InputService extends Remote {
	
	public String exibir(String input) throws RemoteException;

}
