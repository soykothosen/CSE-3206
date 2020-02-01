import java.io.*;
import java.net.*;


class MyClient {

    public static void main( String arg[]) throws Exception {
        
            Socket s = new Socket("localhost",1700);
            ObjectInputStream is = new ObjectInputStream(s.getInputStream());
            frame st = (frame)is.readObject();
            st.showDetails();
            parityChecker ppro = new parityChecker();
            ppro.getParity(28);
            s.close();
        }
        
    }
