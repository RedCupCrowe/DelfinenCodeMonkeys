package Bruger;

import Medlemmer.KonkurrenceMedlem;

import java.util.Scanner;

public class Formand {
    static Scanner scan = new Scanner(System.in);

    public static KonkurrenceMedlem opretMedlem(){
        System.out.println("Navn: ");
        String navn = scan.nextLine();

        System.out.println("Alder: ");
        int alder = scan.nextInt();

        System.out.println("Aktiv Status: ");
        boolean aktiv = scan.nextBoolean();

        System.out.println("Medlemsnummer: ");
        double medlemsnummer = scan.nextDouble();

        System.out.println("Restance: ");
        boolean restance = scan.nextBoolean();


        KonkurrenceMedlem medlem = new KonkurrenceMedlem( navn, alder, aktiv,medlemsnummer, restance);
        return medlem;
    }


}
