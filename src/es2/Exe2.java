package es2;

import java.util.Scanner;

public class Exe2 {
    static void main(String[] args) {
//    scrivi un programma che chiede un intero e lo stampa in lettere se il valore è compreso tra 0 e 3,
//        altrimenti stampa un messaggio di errore usando il costrutto switch

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ciao dammi un numero compreso tra 0 e 3");
        int num = scanner.nextInt();

        switch (num) {
            case 0: {
                System.out.println("il tuo numero è ZERO");
                break;
            }
            case 1: {
                System.out.println("il tuo numero è UNO");
                break;
            }
            case 2: {
                System.out.println("il tuo numero è DUE");
                break;
            }
            case 3: {
                System.out.println("il tuo numero è TRE");
                break;
            }
            default: {
                System.out.println("Devi digitare numeri compresi tra 0 e 3");
            }
        }

//        ---------------------------- variabile alternativa, ricorda di inserire lo switch in una variabile ----------
        String numeroInserito = switch (num) {
            case 0 -> "il tuo numero è ZERO";
            case 1 -> "il tuo numero è UNO";
            case 2 -> "il tuo numero è DUE";
            case 3 -> "il tuo numero è TRE";
            default -> "devi digitare numeri tra 0 e 3";
        };

        System.out.println(numeroInserito);
    }
}
