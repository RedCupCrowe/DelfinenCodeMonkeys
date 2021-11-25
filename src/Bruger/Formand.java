package Bruger;

import Medlemmer.KonkurrenceMedlem;
import Medlemmer.Medlem;
import Medlemmer.MedlemsListe;

import java.util.Scanner;
import java.io.*;

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
        scan.nextLine();

        Medlem medlem = new Medlem( navn, alder, aktiv,medlemsnummer, restance);
        MedlemsListe.addMedlem(medlem);
        System.out.println(MedlemsListe.medlemsListe);
        try {
            String listeMedMedlemmer = "";
            FileWriter writer = new FileWriter("filename.txt");
            for (Medlem m: MedlemsListe.medlemsListe){
                listeMedMedlemmer += m.getNavn() + " "
                    + m.getAlder() + " "
                    + m.getAktivStatus() + " " +
                    m.getMedlemsnummer() + " "
                    + m.getIRestance() + "\n";
            }
            writer.write(listeMedMedlemmer);
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        return medlem;
    }
    public void læsListe(){
        try {
            Scanner scan = new Scanner(new File("filename.txt"));
            while(scan.hasNextLine()){
                String navn = scan.next();
                String alder = scan.next();
                String aktiv = scan.next();
                String medlemsnummer = scan.next();
                String restance = scan.next();
                //TODO: formattering
                System.out.println(navn + alder + aktiv + medlemsnummer + restance);
            }
        }catch (Exception e){

        }
    }


}
