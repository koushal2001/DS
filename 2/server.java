import java.io.*;
import java.net.*;
import java.util.*;

public class server {
    private static final int PORT = 12345;

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Server started. Waiting for connections...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket);

                handleClient(clientSocket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void handleClient(Socket clientSocket) {
        try{
            Scanner scanner = new Scanner(clientSocket.getInputStream());
            while (scanner.hasNextLine()) {
                String clientMessage = scanner.nextLine();
                System.out.println("Received message from client: " + clientMessage);

                clientSocket.getOutputStream().write(("Message Received" + "\n").getBytes());
            }

            System.out.println("Client disconnected: " + clientSocket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
