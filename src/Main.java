public class Main {
    public static void main(String[] args){

        comparePhrases();

    }
    public static void comparePhrases(){
        StringBuilder str1 = new StringBuilder();
        str1.append("La penna è sopra il tavolo");
        StringBuilder str2 = new StringBuilder();
        str2.append("La penna è sul tappeto");
        if (str1.compareTo(str2) == 0){
            System.out.println("Il risultato della comparazione è:" + " " + "Le due stringhe sono uguali");
        }
        else {
            System.out.println("Il risultato della comparazione è:" + " " + "Le due stringhe sono differenti");
        }

    }
}
