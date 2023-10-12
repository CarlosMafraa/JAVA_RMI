import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class PersonSelectMethods extends UnicastRemoteObject implements PersonSelect {
    String Username;
    int valorPerson;
    String[] personagens;
    String personagem;
    int valorStrike;
    String[] golpes;
    String golpe;

    public PersonSelectMethods() throws RemoteException {
        super();
        personagens = new String[] {"Son Goku", "Vegeta", "Piccolo", "Gohan", "Trunks"};
    }

    @Override
    public void setUserName(String nameUser) throws RemoteException {
        this.Username = nameUser;
    }

    @Override
    public String[] listarPersonagens()  throws RemoteException {
        return personagens;
    }

    @Override
    public String[] listarGolpesPersonagens(int valorPerson)  throws RemoteException{
        this.valorPerson = valorPerson;

        switch (valorPerson) {

            case 1:
                String[] golpesGoku = {"Kamehameha", "Genki Dama "};
                this.golpes = golpesGoku;
                return golpesGoku;

            case 2:
                String[] golpesVegeta = {"Final Flash", "Big Bang Attack"};
                this.golpes = golpesVegeta;
                return golpesVegeta;
        }
        return null;
    }

    @Override
    public String frasePhrase( int valorStrike) throws RemoteException {
        for(int i = 0; i <= listarPersonagens().length; i++){
            if(valorPerson == i){
                personagem = personagens[i-1];
                for(int j = 0; j <= golpes.length; j++){
                    if(valorStrike == j){
                        this.valorStrike = valorStrike;
                        golpe = golpes[j-1];
                    }
                }
            }
        }
        return Username + " escolheu "+ personagem + " que lutará a batalha usando o golpe mortal, o famoso "+golpe+".";
    }
}
