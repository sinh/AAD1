/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package s08.networking.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Date;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class UDPServerDemo {

    /**
     * @param args the command line arguments
     * @throws java.net.SocketException
     */
    public static void main(String[] args) throws SocketException, IOException {
        try (DatagramSocket socket = new DatagramSocket(1313)) {
            for (int i = 0; i < 10; i++) {
                byte[] buf = new byte[256];
                DatagramPacket packet = new DatagramPacket(buf, buf.length);
                
                socket.receive(packet);
                
                buf = new Date().toString().getBytes();
                InetAddress address = packet.getAddress();
                int port = packet.getPort();
                packet = new DatagramPacket(buf, buf.length, address, port);
                socket.send(packet);
            }
        }
    }
}

