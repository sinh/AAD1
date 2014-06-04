/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package s08.networking.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class TCPClientDemo {

    /**
     * @param args the command line arguments
     * @throws java.net.UnknownHostException
     */
    public static void main(String[] args) throws UnknownHostException, IOException {
        String hostname = "localhost";
        int port = 4321;
        Socket socket = new Socket(hostname, port);
        InputStream in = socket.getInputStream();
        
        byte read[] = new byte[1024];
        int len = in.read(read);
        String str = new String(read, 0, len);
        System.out.println(str);
    }
}
