/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package s09.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public interface Remote_Interface extends Remote {

    public String sayHello() throws RemoteException;
}
