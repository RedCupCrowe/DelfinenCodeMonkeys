package Other;

import Medlemmer.Medlem;
import Medlemmer.MedlemsListe;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Storage {

    public static void loadStorage(){
        try{
            File myObj = new File("members.txt");
            Scanner fileReader = new Scanner(myObj);
            while(fileReader.hasNextLine()){
                String data = fileReader.nextLine();
                addMedlem(new Medlem(data));
            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
        System.out.println(medlemsListe.getMedlemmer());
    }
    public static void saveStorage(){
        try{
        StringBuilder str = new StringBuilder();
        for (Medlem m : medlemsListe.getMedlemmer()){
            str.append(m.skrivMedlem());
            str.append("\n");

        }



        FileWriter writer = new FileWriter("members.txt");
        writer.write(str.toString());
        writer.close();
    }catch(Exception e){
            e.printStackTrace();
    }
    }

    private static MedlemsListe medlemsListe = new MedlemsListe();

    public static ArrayList<Medlem> getMedlemmer(){
     return medlemsListe.getMedlemmer();
    }
    public static void addMedlem(Medlem medlem){
        medlemsListe.addMedlem(medlem);
    }
}
