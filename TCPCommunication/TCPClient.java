import java.io.*;
import java.net.*;
import java.util.Scanner;
public class TCPClient 
{
 public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a message: ");
            String message = scanner.nextLine();

            dos.writeUTF(message);
            String response = dis.readUTF();

            System.out.println("Response from server: " + response);
        } 
        catch (IOException e) 
        {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}