//Valdemar har været lavet mest i træner, men har fået hjælp og input fra alle i gruppen.

package Brugere;

import Medlemmer.*;
import Storage.Storage;

import java.util.ArrayList;
import java.util.Scanner;

public class Træner {


  private static void printSvømmere() {
    int i = 1;
    for (KonkurrenceMedlem km : Storage.getKonkurrenceMedlemmer()) {
      System.out.println(i + " - " + km.getNavn());
      i++;
    }
  }

  private static TræningsResultat registrerTræningsResultat(Scanner scan) {
    System.out.println("indtast dato");
    double dato = Double.parseDouble(scan.nextLine());
    System.out.println("Indtast tid");
    double tid = Double.parseDouble(scan.nextLine());
    return new TræningsResultat(dato, tid);
  }

  private static KonkurrenceResultat registrerKonkurrenceResultat(Scanner scan) {
    System.out.println("Indtast stævne");
    String stævne = scan.nextLine();
    System.out.println("Indtast svømmetid");
    double konkurrenceTid = Double.parseDouble(scan.nextLine());
    System.out.println("Indtast placering");
    int placering = Integer.parseInt(scan.nextLine());
    return new KonkurrenceResultat(stævne, konkurrenceTid, placering);
  }

  public static void rangliste(Scanner scan) {

    ArrayList<KonkurrenceMedlem> medlemmer = new ArrayList<>(Storage.getKonkurrenceMedlemmer());
    System.out.println("Tryk 1 for at se top 5 butterfly");
    System.out.println("Tryk 2 for at se top 5 crawl");
    System.out.println("Tryk 3 for at se top 5 rygcrawl");
    System.out.println("Tryk 4 for at se top 5 brystsvømning");
    int input = Integer.parseInt(scan.nextLine());
    medlemmer.sort(new CompareSvømmetid(input));
    for (int i = 0; i < 5; i++) {
      if (medlemmer.size() > i) {
        System.out.println((i + 1) + " " + medlemmer.get(i).getNavn());
      }
    }

  }


  public static void svømmedisciplin(Scanner scan) {

    System.out.println("Indtast medlemsindex for at vælge medlem");
    printSvømmere();
    int index = Integer.parseInt(scan.nextLine());
    KonkurrenceMedlem m = Storage.getKonkurrenceMedlemmer().get(index - 1);
    System.out.println("Tryk 1 for registrere butterfly");
    System.out.println("Tryk 2 for registrere crawl");
    System.out.println("Tryk 3 for registrere rygcrawl");
    System.out.println("Tryk 4 for registrere brystsvømning");
    System.out.println("Tryk 5 for at indtaste konkurrenceResultat");
    System.out.println("Tryk 6 for at gå tilbage");

    int indtastTræner1 = Integer.parseInt(scan.nextLine());
    System.out.println(indtastTræner1);
//TODO: Hook op til konkurrenceResultat?¨'
    TræningsResultat resultat;
    switch (indtastTræner1) {


      case 1:
        resultat = registrerTræningsResultat(scan);
        m.registrerButterflyTid(resultat);

        break;
      case 2:
        resultat = registrerTræningsResultat(scan);
        m.registrerCrawlTid(resultat);
        break;
      case 3:
        resultat = registrerTræningsResultat(scan);
        m.registrerRygCrawlTid(resultat);
        break;
      case 4:
        resultat = registrerTræningsResultat(scan);
        m.registrerBrystTid(resultat);
        break;
      case 5:
        KonkurrenceResultat kresultat = registrerKonkurrenceResultat(scan);
        m.registrerKonkurrenceResultat(kresultat);
      case 6:
        break;

      default:

    }
  }
}
