import Bruger.Formand;
import Medlemmer.KonkurrenceMedlem;
import Medlemmer.MedlemsListe;

import java.util.Locale;
import java.util.Scanner;

public class Menu {


  static Scanner scan = new Scanner(System.in);

 static public MedlemsListe liste = new MedlemsListe();

  public static void main(String[] args) {
    while (true) {
      System.out.println("------------KOMMANDOER------------");
      System.out.println("1. formand      = gå til formandsmenu");
      System.out.println("2. kasserer     = gå til kasserermenu");
      System.out.println("3. trænermenu   = gå til trænermenu");
      System.out.println("Skriv en af ovenstående kommandoer:\n");
      String command = scan.nextLine();
      System.out.println(command);

      switch (command.toLowerCase()) {
        case "formand", "1": formandMenu();


          //formandsmenu
          break;
        case "kasserer", "2": kassererMenu();
          //kasserermenu
          break;
        case "træner", "3": trænerMenu();
          //trænermenu
          break;
        default:
          //Nedenstående skrives ud hvis du ikke skriver en af kommandoerne
          System.out.println("Det forstår jeg ikke.");
          break;
      }

    }

  }



  private static void formandMenu() {
    System.out.println("Tryk 1 for at oprette medlem");
    System.out.println("Tryk 2 for at gå tilbage");

    int indtastFormand = scan.nextInt();
    System.out.println(indtastFormand);

    switch (indtastFormand) {
      case 1:
        KonkurrenceMedlem medlem = Formand.opretMedlem();
        liste.addMedlem(medlem);
        System.out.println(liste.getMedlemmer());

        break;
      case 2:
        break;
      default:
    }
  }


  private static void kassererMenu() {
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

  private static void trænerMenu() {
    System.out.println("Tryk 1 for registrere træningsrestultat");

    int indtastTræner = scan.nextInt();
    System.out.println(indtastTræner);

    switch (indtastTræner) {

      case 1: svømmedisciplin();
        break;

      default:

    }
  }

  private static void svømmedisciplin() {
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


