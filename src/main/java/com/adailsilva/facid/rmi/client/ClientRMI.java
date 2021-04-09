package com.adailsilva.facid.rmi.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.security.Provider.Service;

import com.adailsilva.facid.rmi.service.InputService;

public class ClientRMI {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {

		InputService inputService = (InputService) Naming.lookup("rmi://127.0.0.1:5099/urifacid");

		System.out.println("--- " + inputService.exibir("Testando Sistema distribuído com RMI.\n") + "Nome da Classe: "
				+ Service.class.getName());

	}
}
