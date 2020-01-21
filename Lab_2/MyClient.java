import java.io.*;
import java.net.*;

public class MyClient{
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost",1234);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            String str = "", str2="";
            while (!str.equals("stop")) {
            str=br.readLine();
            dout.writeUTF(str);
            dout.flush();

            str2 = (String)dis.readUTF();
            System.out.print(str2 + "\n");
                
            }
           
            
            dout.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}