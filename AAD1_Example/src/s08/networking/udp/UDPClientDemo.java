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
import java.net.UnknownHostException;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class UDPClientDemo {

    /**
     * @param args the command line arguments
     * @throws java.net.SocketException
     * @throws java.net.UnknownHostException
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException, InterruptedException {
        try (DatagramSocket socket = new DatagramSocket()) {
            for (int i = 0; i < 10; i++) {
                byte[] buf = new byte[256];
                InetAddress address = InetAddress.getByName("localhost");
                
                DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 1313);
                
                socket.send(packet);
                
                packet = new DatagramPacket(buf, buf.length);
                socket.receive(packet);
                String received = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Current server time: " + received);
                Thread.sleep(1500);
            }
        }
    }
}
