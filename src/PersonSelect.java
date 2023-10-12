import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface PersonSelect extends Remote {

    void setUserName(String nomeUser) throws RemoteException;
    String[] listarPersonagens() throws RemoteException;;

    String[] listarGolpesPersonagens(int valor) throws RemoteException;

    String frasePhrase(int valor) throws RemoteException;
}
