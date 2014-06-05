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
        String hostname = "10.22.5.184";
        int port = 4321;
        //Tạo một kết nối đến Server (hostname, cổng 4321)
        Socket socket = new Socket(hostname, port);
        InputStream in = socket.getInputStream();
        //Đọc dữ liệu từ Server trả về
        byte read[] = new byte[1024];
        int len = in.read(read);
        //Đổi kiểu dữ liệu từ byte sang chuỗi và hiển thị
        String str = new String(read, 0, len);
        System.out.println(str);
    }
}
