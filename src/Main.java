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
            StringBuilder str3 = new StringBuilder("Il risultato della comparazione è:");
            StringBuilder str4 = new StringBuilder("Le due stringhe sono uguali");
            System.out.println( str3.append(str4));
        }
        else {
            StringBuilder str5 = new StringBuilder("Il risultato della comparazione è:");
            StringBuilder str6 = new StringBuilder("Le due stringhe sono differenti");
            System.out.println( str5.append(str6));
        }

    }
}
