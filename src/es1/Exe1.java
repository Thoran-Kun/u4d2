package es1;

public class Exe1 {
    static void main(String[] args) {
//        accetta una stringa e ritorna true se il numero di caratteri è pari e false se dispari
        String testo = "Questa è una stringa di testo Java";
        int lunghezzaTesto = testo.length();

        if (lunghezzaTesto % 2 == 0) {
            System.out.println("La lunghezza è pari: true");
        } else {
            System.out.println("la lunghezza è dispari: false");
        }

        //------------------------------------- Exe2 ------------------------------------------

//        accetta un anno espresso come intero e turna true se bisestile, false se non lo è.

        int annoBisestile = 2000;
        if ((annoBisestile % 4 == 0 && annoBisestile % 100 != 0) || (annoBisestile % 400 == 0)) {
            System.out.println("L'anno " + annoBisestile + " digitato è Bisestile");
        } else {
            System.out.println("L'anno " + annoBisestile + " digitato NON è Bisestile");
        }
    }

}
