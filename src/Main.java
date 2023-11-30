import entities.Dipendente;

public class Main {
    public static void main(String[] args) {
        Dipendente mario = new Dipendente(235687, Dipendente.Dipartimento.PRODUZIONE, 20, Dipendente.Livello.QUADRO);
        System.out.println(mario.toString());
        mario.promuovi();
        System.out.println(mario.toString());
    }
}