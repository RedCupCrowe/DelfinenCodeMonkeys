package Bruger;

import Medlemmer.KonkurrenceMedlem;
import Medlemmer.Medlem;

import java.util.Scanner;

public class Formand {
    static Scanner scan = new Scanner(System.in);

    public Medlem opretMedlem(){
        System.out.println("Navn: " );
        String navn = scan.nextLine();

        System.out.println("Alder: " );
        int alder = scan.nextInt();

        System.out.println("Aktiv Status: " );
        boolean aktiv = scan.nextBoolean();

        System.out.println("Medlemsnummer: " );
        int medlemsnummer = scan.nextInt();

        System.out.println("Restance: ");
        boolean restance = scan.nextBoolean();


        Medlem medlem = new Medlem( navn, alder, aktiv,medlemsnummer, restance);
        return medlem;
    }


}
