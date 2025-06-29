import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class SubtractServer {
    public static void main(String[] args) {
        try {
            SubtractImpl subtractObj = new SubtractImpl();
            Registry registry = LocateRegistry.createRegistry(1099); 
            registry.rebind("SubtractService", subtractObj);
            System.out.println("SubtractService bound in registry.");
        } catch (Exception e) {
            System.out.println("Server error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}