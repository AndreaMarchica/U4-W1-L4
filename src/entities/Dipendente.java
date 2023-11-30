package entities;

public class Dipendente {
    /*ATTRIBUTI*/
    public static double stipendioBase = 1000;
    private static int matricola;
    private static double stipendio;
    private static double importoOrarioStraordinario;
    public enum Livello {OPERAIO, IMPIEGATO, QUADRO, DIRIGENTE};
    public enum Dipartimento {PRODUZIONE, AMMINISTRAZIONE, VENDITE};
    private Livello livello;
    private Dipartimento dipartimento;

    /*COSTRUTTORI*/

    public Dipendente(int matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERAIO;
    }
    public Dipendente(int matricola, Dipartimento dipartimento, double importoOrarioStraordinario, Livello livello){
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
    }

    /*METODI*/
    @Override
    public String toString() {
        return "Matricola: " + matricola +
                " Dipartimento: " + dipartimento +
                " Stipendio Base: " + stipendioBase +
                " Stipendio: " + stipendio +
                " Importo Orario Straordinario: " + importoOrarioStraordinario +
                " Livello: " + livello;
    }
    public void promuovi(){
        if(this.livello == Dipendente.Livello.OPERAIO){
            this.livello = Livello.IMPIEGATO;
            this.stipendio = stipendioBase * 1.2;
        } if(this.livello == Livello.IMPIEGATO){
            this.livello = Livello.QUADRO;
            this.stipendio = stipendioBase * 1.5;
        } if(this.livello == Livello.QUADRO){
            this.livello = Livello.DIRIGENTE;
            this.stipendio = stipendioBase * 2;
        } else System.out.println("Sei già il capo");
    }
    public static void calcolaPaga(Dipendente dipendente){
        System.out.println(dipendente.stipendio);
    }

    public static void calcolaPaga(Dipendente dipendente, double importoOrarioStraordinario){
        System.out.println("STIPENDIO " + dipendente.stipendio + " ORE DI STRAORDINARIO " + importoOrarioStraordinario);
    }
    /*   getter*/
    public double getStipendioBase() {
        return stipendioBase;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }
}
