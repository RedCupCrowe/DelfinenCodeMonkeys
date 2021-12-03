//Frederik har lavet mest i kasserer, men alle har bidraget med input.

package Brugere;

import Medlemmer.Medlem;

import java.util.ArrayList;

public class Kasserer {


    public static ArrayList<Medlem> getMedlemmerIRestance(ArrayList<Medlem> medlemmer) {
        // - lav en ny arrayliste af medlemmer (tom til at starte med)
        ArrayList<Medlem> medlems = new ArrayList<>();
        // - gå igennem alle medlemmer i medlemsListe
        for (Medlem m : medlemmer)
            if (m.getIRestance() == true){
                medlems.add(m);

            }
        // - kopier medlemmet hvis det er i restance til den nye liste
        // - returner den nye liste
        return medlems;
    }

    public static int seIndtægt(ArrayList<Medlem> medlemmer) {

        int totalIndbetaling = 0;
        for (Medlem m : medlemmer) {
            if (!m.getIRestance()) {
                totalIndbetaling = totalIndbetaling + m.getKontingent();

            }
        }

        return totalIndbetaling;
    }

}

