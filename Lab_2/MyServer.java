import java.io.*;
import java.net.*;

public class MyServer{
    public static void main(String[] args)throws Exception{
        try {
            ServerSocket ss=new ServerSocket(1234);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           
            String str = "" , str1="";
            while (!str.equals("stop")) {
                str = (String)dis.readUTF();
                System.out.print(str + "\n");

                str1=br.readLine();
                dout.writeUTF(str1);
                dout.flush();
                
            }

            dis.close();
            s.close();
           
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}