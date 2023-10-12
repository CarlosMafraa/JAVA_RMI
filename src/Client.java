import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws RuntimeException {
        try {
            Scanner scanner = new Scanner(System.in);

            LocateRegistry.getRegistry();
            PersonSelect personSelect = (PersonSelect) Naming.lookup("PersonSelectService");

            System.out.printf("\nInsira seu nome: ");
            String usuario =scanner.next();

            personSelect.setUserName(usuario);

            String [] personagens = personSelect.listarPersonagens();

            System.out.printf("\nEscolha um personagem: \n");
            for (int i = 0; i < personagens.length; i++) {
                System.out.println((i + 1) + " - " + personagens[i]);
            }

            System.out.print("\nDigite o número do personagem desejado: ");
            int valorPerson = scanner.nextInt();

            String[] todosGolpes = personSelect.listarGolpesPersonagens(valorPerson);

            System.out.print("\nEscolha qual golpe deseja utilizar :\n" );

            for (int i = 0; i < todosGolpes.length; i++) {
                System.out.println((i + 1) + " - " + todosGolpes[i]);
            }

            System.out.print("\nDigite o número do golpe desejado: ");
            int valorStrike = scanner.nextInt();

            System.out.println("\n" + personSelect.frasePhrase(valorStrike));


        } catch (Exception  e) {
            System.err.println("Erro no cliente: " + e.getMessage());
        }
    }
}
