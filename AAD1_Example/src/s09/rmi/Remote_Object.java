/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package s09.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class Remote_Object extends UnicastRemoteObject implements Remote_Interface {

    public Remote_Object() throws RemoteException {
        super();
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello RMI Application";
    }
}
