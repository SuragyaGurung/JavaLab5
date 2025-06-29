import java.rmi.Remote;
import java.rmi.RemoteException;
public interface Subtract extends Remote 
{
    double subtract(double a, double b) throws RemoteException;
}