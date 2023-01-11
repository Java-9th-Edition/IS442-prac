package ICE3.ObjectSocketDemo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost", Server.PORT);

            // set up output stream to send object to client
            ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
            // set up input stream to receive object from client
            ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());

            Person person = new Person("John", 20);

            outStream.writeObject(person);
            Person recvPerson = (Person) inStream.readObject();
            System.out.println(recvPerson.getName());

            outStream.close();
            socket.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
