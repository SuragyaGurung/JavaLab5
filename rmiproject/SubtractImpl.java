import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SubtractImpl extends UnicastRemoteObject implements Subtract {
    protected SubtractImpl() throws RemoteException {
        super();
    }

    public double subtract(double a, double b) throws RemoteException {
        return a - b;
    }
}