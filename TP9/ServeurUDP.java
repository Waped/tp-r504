import java.io.*;
import java.net.*;

public class ServeurUDP
{
    public static void main( String[] args )
    {
        String s = "Hello World";  
        byte[] data = s.getBytes();
        try
        { 
            DatagramSocket sock = new DatagramSocket(1234);
            while(true)
            {
                System.out.println( "-Waiting data");
                DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
                sock.receive(packet);
                sock.send(packet);
                String str = new String(packet.getData());
                System.out.println( "str" + str);
            }

        }  
        catch( Exception err )
        {
            System.out.println("Erreur!");
        }
    }
}