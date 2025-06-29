import java.io.*;
import java.net.*;
public class TCPServer 
{
public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server started. Waiting for client...");

            while (true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    System.out.println("Client connected.");

                    DataInputStream dis = new DataInputStream(clientSocket.getInputStream());
                    DataOutputStream dos = new DataOutputStream(clientSocket.getOutputStream());

                    String message = dis.readUTF();
                    System.out.println("Received from client: " + message);

                    String response = message.toUpperCase();
                    dos.writeUTF(response);
                    System.out.println("Sent to client: " + response);
                } catch (IOException e) {
                    System.out.println("Connection error: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Server exception: " + e.getMessage());
        }
    }
}