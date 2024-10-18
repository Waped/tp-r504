import java.io.*;
import java.net.*;

public class ClientTCP3
{
    public static void main( String[] args )
    {
        if ( args.length == 0 )
        {
            System.out.println("manque arg");
        }
        try
        {
            Socket socket =  new Socket( "localhost" , 2016 );
            DataOutputStream dOut = new DataOutputStream( socket.getOutputStream());
            dOut.writeUTF( args [0] );
            socket.close();
        }

        catch( Exception err )
        {
            System.out.println("Erreur!");
        }

    }
}