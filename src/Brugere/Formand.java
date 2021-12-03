//Johannes har været primus motor på formand, men alle har været inde over.

package Brugere;

import Medlemmer.KonkurrenceMedlem;
import Medlemmer.Medlem;
import Storage.Storage;

import java.util.Scanner;

public class Formand {
  static Scanner scan = new Scanner(System.in);

  public Medlem opretMedlem() {

    System.out.println("Navn: ");
    String navn = scan.nextLine();

    System.out.println("Alder: ");
    int alder = scan.nextInt();

    System.out.println("Aktiv Status: ");
    boolean aktiv = scan.nextBoolean();

    System.out.println("Medlemsnummer: ");
    int medlemsnummer = scan.nextInt();

    System.out.println("Restance: ");
    boolean restance = scan.nextBoolean();
    scan.nextLine();

    Medlem medlem = new Medlem(navn, alder, aktiv, medlemsnummer, restance);
    Storage.addMedlem(medlem);
    System.out.println(Storage.getMedlemmer());

    return medlem;
  }

  public KonkurrenceMedlem opretKonkurrenceMedlem() {
    System.out.println("Navn: ");
    String navn = scan.nextLine();

    System.out.println("Alder: ");
    int alder = Integer.parseInt(scan.nextLine());

    System.out.println("Aktiv Status: ");
    boolean aktiv = Boolean.parseBoolean(scan.nextLine());

    System.out.println("Medlemsnummer: ");
    int medlemsnummer = Integer.parseInt(scan.nextLine());

    System.out.println("Restance: ");
    boolean restance = Boolean.parseBoolean(scan.nextLine());

    KonkurrenceMedlem medlem = new KonkurrenceMedlem(navn, alder, aktiv, medlemsnummer, restance);
    boolean loop = true;
    while (loop == true) {
      System.out.println("vælg disciplin at tilmelde:");
      System.out.println("1: butterfly");
      System.out.println("2: crawl");
      System.out.println("3: rygcrawl");
      System.out.println("4: bryst");
      System.out.println("0: afslut tilmelding");
      int værdi = Integer.parseInt(scan.nextLine());
      if (værdi == 0) {
        loop = false;
      } else {
        medlem.tilmeldDisciplin(værdi);
      }
    }

    Storage.addMedlem(medlem);
    System.out.println(Storage.getMedlemmer());


    return medlem;
  }
}
