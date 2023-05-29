import java.io.*;
import java.net.*;
import java.util.*;

public class client {
    private static final String SERVER_IP = "localhost";
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        try {
            Socket socket = new Socket(SERVER_IP, SERVER_PORT);
            Scanner scanner = new Scanner(System.in);
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            System.out.println("Connected to server. Start typing messages:");

            while (true) {
                String userInput = scanner.nextLine();
                
                writer.println(userInput);

                // Read and print the server's response
                System.out.println("Server response: " + new Scanner(socket.getInputStream()).nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
