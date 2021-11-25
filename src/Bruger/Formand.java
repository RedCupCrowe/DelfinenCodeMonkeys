package Bruger;

import Medlemmer.KonkurrenceMedlem;
import Medlemmer.Medlem;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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

        try {
            FileWriter writer = new FileWriter("medlemsliste.txt");
            writer.write(navn + "\n" + alder + "\n" + aktiv + "\n" + medlemsnummer + "\n" + restance);
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return medlem;
    }


}
