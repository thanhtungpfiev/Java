import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author thanh
 * @date 3/13/2022
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    public MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says, 'Hey'";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("Remote Hello", service);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
