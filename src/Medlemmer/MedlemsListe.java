package Medlemmer;

import java.util.ArrayList;

public class MedlemsListe {
  // Brug af static simulerer en database.
  public static ArrayList<Medlem> medlemsListe = new ArrayList<>();

  public static void addMedlem (Medlem medlem) {
    medlemsListe.add(medlem);
  }

  public static ArrayList<Medlem> getMedlemmer(){
    return medlemsListe;
  }

  public static void removeMedlem (Medlem medlem) {
    medlemsListe.remove(medlem);
  }




  }



