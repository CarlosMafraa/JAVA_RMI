import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor {
    public static void main(String[] args) {

        try {
            Registry registro = LocateRegistry.createRegistry(1099);
            PersonSelectMethods servidor = new PersonSelectMethods();
            registro.rebind("PersonSelectService", servidor);
            System.out.printf("O Servidor está funcionando!");
        } catch (Exception e){
            System.out.printf("Erro: " +e.getMessage());
        }
    }
}
