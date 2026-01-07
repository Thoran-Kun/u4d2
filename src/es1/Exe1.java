package es1;

public class Exe1 {

    private static boolean lunghezzaTesto(String testo) {
        int lunghezzaTesto = testo.length();
        if (lunghezzaTesto % 2 == 0) {
            System.out.println("La lunghezza è pari: true");
            return true;
        } else {
            System.out.println("la lunghezza è dispari: false");
            return false;
        }
    }

    private static boolean annoBisestile(int annoBisestile) {
        if ((annoBisestile % 4 == 0 && annoBisestile % 100 != 0) || (annoBisestile % 400 == 0)) {
            System.out.println("L'anno " + annoBisestile + " digitato è Bisestile");
            return true;
        } else {
            System.out.println("L'anno " + annoBisestile + " digitato NON è Bisestile");
            return false;
        }
    }

    static void main(String[] args) {
//        accetta una stringa e ritorna true se il numero di caratteri è pari e false se dispari
        String testo = "Questa è una stringa di testo Java";

        boolean b = lunghezzaTesto(testo);
        System.out.println("la lunghezza del testo è: " + b);
        //------------------------------------- Exe2 ------------------------------------------

        int anno = 2000;
        boolean annoDaControllare = annoBisestile(anno);

        System.out.println("l'anno " + anno + " è bisestile? " + annoDaControllare);
    }

}
