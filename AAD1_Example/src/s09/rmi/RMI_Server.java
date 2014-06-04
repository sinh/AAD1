/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package s09.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class RMI_Server {

    public static void main(String[] args) {
        try {
            Remote_Object ro = new Remote_Object();
            Registry reg = LocateRegistry.createRegistry(9999);
            Naming.rebind("rmi://localhost:9999/RMI_Server", ro);
            System.out.println("Server is running...");
        } catch (MalformedURLException | RemoteException ex) {
        }
    }
}
