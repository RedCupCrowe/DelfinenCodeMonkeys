package Medlemmer;

import java.util.ArrayList;

public class MedlemsListe {

    private ArrayList<Medlem> medlemsListe;

    public MedlemsListe() {
        medlemsListe = new ArrayList<>();
    }

    public void addMedlem(Medlem medlem) {
        medlemsListe.add(medlem);
    }

    public ArrayList<Medlem> getMedlemmer() {
        return medlemsListe;
    }

    public void removeMedlem(Medlem medlem) {
        medlemsListe.remove(medlem);
    }

    public ArrayList<KonkurrenceMedlem> getKonkurrenceMedlemmer() {
        ArrayList<KonkurrenceMedlem> result = new ArrayList<>();
        for (Medlem m : medlemsListe) {
            if (m instanceof KonkurrenceMedlem) {
                result.add((KonkurrenceMedlem) m);
            }
        }
        return result;
    }


}



