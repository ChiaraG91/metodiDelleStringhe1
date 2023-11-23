public class Main {
    public static void main(String[] args){

        comparePhrases();

    }
    public static void comparePhrases(){
        String phrase1 = "La penna è sopra il tavolo";
        String phrase2 = "La penna è sul tappeto";

        if (phrase1.compareTo(phrase2) == 0){
            System.out.println("Il risultato della comparazione è:" + " " + "Le due stringhe sono uguali");
        }
        else {
            System.out.println("Il risultato della comparazione è:" + " " + "Le due stringhe sono differenti");
        }

    }
}
