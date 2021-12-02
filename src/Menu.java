import Bruger.Formand;
import Bruger.Kasserer;
import Bruger.Træner;
import Medlemmer.KonkurrenceMedlem;
import Medlemmer.Medlem;
import Medlemmer.MedlemsListe;
import Medlemmer.TræningsResultat;
import Other.Storage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Menu {

  /*
Træner skal kunne registrere discipliner på konkurrencemedlemmer.
Kasserer skal kunne se en oversigt over medlemmer i restance.
Kasserer skal kunne se en udregning over hvor meget de kan forvente at få indbetalt i kontingent (dvs. uden dem der er i restance).
TODO: Menuerne skal forbindes. ved hvordan laves, skal bare gøres.
Et kig på grasp.
Mulighed for træner for at se top 5 for hver svømmedisciplin fordelt på henholdsvis junior- og seniorsvømmere.
registrere stævne- og træningstider og forbinde dem til hvert medlem.
Gøre så listen med medlemmer ikke bliver slettet hver gang vi genstarter programmet.
Gøre så vi kan åbne filen uden for IntelliJ.
Sørge for at formanden kan ændre i medlem. Evt. bare sørge for at man kan slette medlemmer.

*/


    public static void formandMenu(Scanner scan) {
        //TODO: opdater
        System.out.println("Tryk 1 for at oprette medlem");
        System.out.println("Tryk 2 for at se en liste med medlemmer");
        System.out.println("Tryk 3 for at slette et medlemmer");
        System.out.println("Tryk 4 for at oprette konkurrencemedlem");
        System.out.println("Tryk 5 for at lukke programmet");
        System.out.println("Tryk 6 for at gå tilbage");

        Formand formand = new Formand();
        int indtastFormand = Integer.parseInt(scan.nextLine());
        System.out.println(indtastFormand);

        switch (indtastFormand) {
            case 1:
                Medlem m = formand.opretMedlem();
                break;
            case 2:
                System.out.println(Storage.getMedlemmer());
                break;
            case 3:

                break;
            case 4:
                Medlem km = formand.opretKonkurrenceMedlem();
                break;
            case 5:
                shutdown();
                break;
            default:
        }
    }


    public static void kassererMenu(Scanner scan) {
        System.out.println("Tryk 1 for at se samlet kontingentindbetaling");
        System.out.println("Tryk 2 for oversigt over medlem i restance");
        System.out.println("Tryk 3 for at gå tilbage");

        int indtastKasserer = scan.nextInt();
        System.out.println(indtastKasserer);

        switch (indtastKasserer) {

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
        System.out.println("Tryk 1 for at registrere et resultat");
        System.out.println("Tryk 2 for at se top 5 svømmere");
        System.out.println("Tryk 3 for at gå tilbage");

        int indtastTræner = Integer.parseInt(scan.nextLine());
        System.out.println(indtastTræner);

        switch (indtastTræner) {

            case 1:
                Træner.svømmedisciplin(scan);
                break;
            case 2:
                Træner.rangliste(scan);
                break;
            case 3:
                break;

            default:

        }
    }



    private static void shutdown() {
        Storage.saveStorage();
        System.exit(0);
    }
}


