package es3;

import java.util.Scanner;

public class Exe3 {
    static void main(String[] args) {
//        scrivi un programma che ciede di inserire una stringa e la suddivida in caratteri separati da virgola. il programma si
//        interrompe quando l'utente inserisce la strinha ": q"
        Scanner scanner = new Scanner(System.in);

        String testo = scanner.nextLine();

        while (true) {
            System.out.println("inserisci del testo o digita `q` per uscire");
            testo = scanner.nextLine();
            if (testo.equals("q")) {
                System.out.println("programma terminato");
                break;
            }
//            googlando ho trovato che per separare i caratteri di una stringa da virgola si fa così
            String testoFinale = String.join(",", testo.split(""));

            System.out.println("la tua stringa ora è: " + testoFinale);
        }
        scanner.close();
    }
}
