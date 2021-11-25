import Medlemmer.MedlemsListe;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    static public MedlemsListe liste = new MedlemsListe();

    public static void main(String[] args) {
        Menu menu = new Menu();

        while (true) {
            System.out.println("------------KOMMANDOER------------");
            System.out.println("1. formand      = gå til formandsmenu");
            System.out.println("2. kasserer     = gå til kasserermenu");
            System.out.println("3. trænermenu   = gå til trænermenu");
            System.out.println("Skriv en af ovenstående kommandoer:\n");
            String command = scan.nextLine();
            System.out.println(command);

            switch (command.toLowerCase()) {
                case "formand", "1":
                    menu.formandMenu(scan);


                    //formandsmenu
                    break;
                case "kasserer", "2":
                    menu.kassererMenu(scan);
                    //kasserermenu
                    break;
                case "træner", "3": menu.trænerMenu(scan);
                    //trænermenu
                    break;
                default:
                    //Nedenstående skrives ud hvis du ikke skriver en af kommandoerne
                    System.out.println("Det forstår jeg ikke.");
                    break;
            }

        }

    }
}
