package es4;

import java.util.Scanner;

public class Exe4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero per far partire il conto alla rovescia: ");
        int countDown = Integer.parseInt(scanner.nextLine());

        for (int i = countDown; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("BOOOOM");
    }
}