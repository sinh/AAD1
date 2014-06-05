/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package s08.networking.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class TCPServerDemo {

    /**
     * @param args the command line arguments
     * @throws java.net.UnknownHostException
     */
    public static void main(String[] args) throws UnknownHostException, IOException {
        // TODO code application logic here
        int port = 4321;
        //Tạo một ServerSocket
        ServerSocket ss = new ServerSocket(port);
        System.out.println("Server is running!");
        while (true) {
            //Khi nhận một kết nối từ client
            try (Socket s = ss.accept()) {
                //Lấy địa chỉ IP và Port của client kết nối đến
                String response = "Hello " + s.getInetAddress() + " on port " + s.getPort() + "\r\n";
                response += "This is " + s.getLocalAddress() + " on port " + s.getLocalPort() + "\r\n";
                //Trả về cho client chuỗi response
                OutputStream out = s.getOutputStream();
                out.write(response.getBytes("US-ASCII"));
                out.flush();
            } catch (IOException ex) {
            }
        }
    }
}
