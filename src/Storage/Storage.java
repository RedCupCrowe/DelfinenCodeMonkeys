//Naomi og Johannes er dem der primært har stået for Storage.

package Storage;

import Medlemmer.KonkurrenceMedlem;
import Medlemmer.Medlem;
import Medlemmer.MedlemsListe;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Storage {

  public static void loadStorage() {
    try {
      File myObj = new File("members.txt");
      Scanner fileReader = new Scanner(myObj);
      while (fileReader.hasNextLine()) {
        String data = fileReader.nextLine();
        addMedlem(new Medlem(data));
      }
      myObj = new File("CompMembers.txt");
      fileReader = new Scanner(myObj);
      while (fileReader.hasNextLine()) {
        String data = fileReader.nextLine();
        addMedlem(KonkurrenceMedlem.parseKonkurrenceMedlem(data));
      }
    } catch (Exception e) {
      System.out.println("An error occurred.");
      e.printStackTrace();

    }
    System.out.println(medlemsListe.getMedlemmer());
  }

  public static void saveStorage() {
    try {
      StringBuilder str = new StringBuilder();
      for (Medlem m : medlemsListe.getMedlemmer()) {
        if (!(m instanceof KonkurrenceMedlem)) {
          str.append(m.skrivMedlem());
          str.append("\n");
        }
      }
      FileWriter writer = new FileWriter("members.txt");
      writer.write(str.toString());
      writer.close();

      str = new StringBuilder();
      for (Medlem m : medlemsListe.getKonkurrenceMedlemmer()) {
        str.append(m.skrivMedlem());
        str.append("\n");
      }
      writer = new FileWriter("CompMembers.txt");
      writer.write(str.toString());
      writer.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static MedlemsListe medlemsListe = new MedlemsListe();

  public static ArrayList<Medlem> getMedlemmer() {
    return medlemsListe.getMedlemmer();
  }

  public static void addMedlem(Medlem medlem) {
    medlemsListe.addMedlem(medlem);
  }

  public static ArrayList<KonkurrenceMedlem> getKonkurrenceMedlemmer() {
    return medlemsListe.getKonkurrenceMedlemmer();
  }
}
