/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package s09.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class RMI_Client {

    public static void main(String[] args) {
        try {
            String rmi_URL = "rmi://localhost:9999/RMI_Server";
            Object obj = Naming.lookup(rmi_URL);
            if (obj instanceof Remote_Interface) {
                Remote_Interface ri = (Remote_Interface) Naming.lookup(rmi_URL);
                String str = ri.sayHello();
                System.out.println("Response: " + str);
            }
        } catch (MalformedURLException | NotBoundException | RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
