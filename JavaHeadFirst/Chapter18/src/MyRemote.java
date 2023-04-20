import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author thanh
 * @date 3/13/2022
 */
public interface MyRemote extends Remote  {
    public String sayHello() throws RemoteException;
}
