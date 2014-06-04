/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package s08.networking;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class DemoDownloader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int c;
            URL hp = new URL("http://www.java2s.com/Code/JavaAPI/javax.net/URL.htm");
            URLConnection hpCon = hp.openConnection();
            if (hpCon.getContentLength() > 0) {
                InputStream input = hpCon.getInputStream();
                FileOutputStream fos = new FileOutputStream("demo.htm");
                int i = hpCon.getContentLength();
                while (((c = input.read()) != -1) && (--i > 0)) {
                    System.out.print((char) c);
                    fos.write(c);
                }
                input.close();
                fos.close();
            } else {
                System.out.println("No Content Available");
            }
            hp = new URL("http://www.java2s.com");
            System.out.println("Protocol: " + hp.getProtocol());
            System.out.println("Port: " + hp.getPort());
            System.out.println("Host: " + hp.getHost());
            System.out.println("File: " + hp.getFile());
            System.out.println("Ext:" + hp.toExternalForm());

        } catch (IOException e) {
            System.out.println("Have Exception");
        }

    }
}
