package ICE3.ObjectSocketDemo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static final int PORT = 1234;

    public static String message;

    public static void main(String[] args) {
        try {
            // set socket for receiving from client
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Server is up and running on port: " + Server.PORT);
            // .accept() to wait for client to connect, keeps program running until client connects
            Socket clientSocket = serverSocket.accept();
            // set up output stream to send object to client
            ObjectOutputStream outStream = new ObjectOutputStream(clientSocket.getOutputStream());
            // set up input stream to receive object from client
            ObjectInputStream inStream = new ObjectInputStream(clientSocket.getInputStream());

            // type cast incoming object to Person type
            Person person = (Person) inStream.readObject();
            System.out.println("Received: " + person);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());

            if (person.getAge() < 18){
                person.setName("less than 18");
            } else {
                person.setName("more than 18");
            }

            outStream.writeObject(person);

            inStream.close();
            outStream.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
