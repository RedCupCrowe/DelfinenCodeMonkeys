import Bruger.Formand;
import Medlemmer.KonkurrenceMedlem;
import Medlemmer.Medlem;
import Medlemmer.MedlemsListe;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Menu {




  public void formandMenu(Scanner scan) {
    //TODO: opdater
    System.out.println("Tryk 1 for at oprette medlem");
    System.out.println("Tryk 2 for at gå tilbage");

    Formand formand = new Formand();
    int indtastFormand = scan.nextInt();
    System.out.println(indtastFormand);

    switch (indtastFormand) {
      case 1:
        Medlem m = formand.opretMedlem();

        break;
      case 2:
        formand.læsListe();
        break;
      case 3:
        break;
      default:
    }
  }


  public void kassererMenu(Scanner scan) {
    System.out.println("Tryk 1 for kontingent");
    System.out.println("Tryk 2 for oversigt over medlem i restance");
    System.out.println("Tryk 3 for at gå tilbage");

    int indtastkassere = scan.nextInt();
    System.out.println(indtastkassere);

    switch (indtastkassere) {

      case 1:
        break;
      case 2:
        break;
      case 3:
        break;
      default:
    }
  }

  public static void trænerMenu(Scanner scan) {
    System.out.println("Tryk 1 for registrere træningsrestultat");

    int indtastTræner = scan.nextInt();
    System.out.println(indtastTræner);

    switch (indtastTræner) {

      case 1: svømmedisciplin(scan);
        break;

      default:

    }
  }

  private static void svømmedisciplin(Scanner scan) {
    System.out.println("Tryk 1 for registrere butterfly");
    System.out.println("Tryk 2 for registrere crawl");
    System.out.println("Tryk 3 for registrere rygcrawl");
    System.out.println("Tryk 4 for registrere brystsvømning");
    System.out.println("Tryk 5 for at gå tilbage");

    int indtastTræner1 = scan.nextInt();
    System.out.println(indtastTræner1);

    switch (indtastTræner1) {

      case 1:
        break;
      case 2:
        break;
      case 3:
        break;
      case 4:
        break;
      case 5:
        break;

      default:

    }
  }

}


