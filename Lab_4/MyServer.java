import java.net.*;
import java.io.*;


class MyServer {

    public static void main(String arg[]) throws Exception {

        ServerSocket server = new ServerSocket(1700);

        Socket s = server.accept();

        ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());

        frame object1 = new frame(28, "Soykot", 3206);

        os.writeObject(object1);

        parityChecker ppro = new parityChecker();
        ppro.getParity(28);

        s.close();
        
    }
    
}