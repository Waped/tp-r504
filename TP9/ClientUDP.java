import java.io.*;
import java.net.*;

public class ClientUDP
{
    public static void main( String[] args )
    {
        String s = "Hello World";
        byte[] data = s.getBytes();
        try
        {
            InetAddress addr = InetAddress.getLocalHost();
            System.out.println("adresse=" + addr.getHostName());

            DatagramPacket packet = new DatagramPacket(data, data.length, addr, 1234);
            DatagramSocket sock = new DatagramSocket();
            sock.send(packet);
            while(true)
            {
                sock.receive(packet);
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