import java.io.*;
import java.net.*;

public class ServeurTCP3
{
    public static void main( String[] args )
    {
        try
        {
            ServerSocket socketserver = new ServerSocket( 2016);
            System.out.println( "Serveur en attente :)" );    
            
            

            while(true)
            {
                Socket socket =  socketserver.accept();
                System.out.println( "Connection d'un client yepee!");
                DataInputStream dIn = new DataInputStream(socket.getInputStream());
                String rev = new StringBuilder(dIn.readUTF()).reverse().toString();
                System.out.println( "Message: " + rev );
                socket.close();
            }
 //               socketserver.close();
            

        }

        catch( Exception err )
        {
            System.out.println("Erreur!");
        }

    }
}