/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s08.networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class InetAddress_Test {

    public static void main(String[] args) {
        try {
            InetAddress iad = InetAddress.getLocalHost();
            System.out.println("Host Name: " + iad.getHostName());
            System.out.println("Host Address: " + iad.getHostAddress());
        } catch (UnknownHostException ex) {
        }
    }
}
