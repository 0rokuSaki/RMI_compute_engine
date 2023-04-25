package client;

import shared.Compute;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    static final String HOST_ADDR = "localhost";
    static final int HOST_PORT = 10101;

    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry(HOST_ADDR, HOST_PORT);  // Locate server's registry
        Compute stub =
                (Compute) registry.lookup("Compute");  // Obtain a reference to the remote object
        // Invoke methods on the remote object
        Integer result = stub.executeTask(new HardTask());
        System.out.println("Calculation result is: " + result);
    }
}
