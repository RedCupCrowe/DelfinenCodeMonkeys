import Medlemmer.MedlemsListe;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    static public MedlemsListe liste = new MedlemsListe();

    public static void main(String[] args) {
        Menu menu = new Menu();

        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        while (true) {
            System.out.println("------------KOMMANDOER------------");
            System.out.println("1. Formand      = gå til formandsmenu");
            System.out.println("2. Kasserer     = gå til kasserermenu");
            System.out.println("3. Trænermenu   = gå til trænermenu");
            System.out.println("Skriv en af ovenstående kommandoer:\n");
            String command = scan.nextLine();
            System.out.println(command);

            switch (command.toLowerCase()) {
                case "formand", "1" -> menu.formandMenu(scan);


                //formandsmenu
                case "kasserer", "2" -> menu.kassererMenu(scan);

                //kasserermenu
                case "træner", "3" -> menu.trænerMenu(scan);

                //trænermenu
                default ->
                    //Nedenstående skrives ud hvis du ikke skriver en af kommandoerne
                    System.out.println("Det forstår jeg ikke.");
            }

        }

    }
}
