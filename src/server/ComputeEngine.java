package server;

import shared.Compute;
import shared.Task;

import java.rmi.RemoteException;

public class ComputeEngine implements Compute {

    @Override
    public <T> T executeTask(Task<T> task) throws RemoteException {
        return task.execute();
    }
}
