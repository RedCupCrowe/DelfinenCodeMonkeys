package Bruger;

import Medlemmer.Medlem;
import Medlemmer.MedlemsListe;

import java.util.ArrayList;

public class Kasserer {
    /*
    Klubbens kasserer tager sig af alt vedrørende kontingentbetaling.
    Kontingentets størrelse er betinget af flere forhold:For aktive medlemmer er kontingentet for ungdomssvømmere (under 18 år) 1000 kr. årligt, for senior svømmere (18år og over)1600kr.
    årligt. For medlemmer over 60 år gives der 25% rabat af seniortaksten.
    For passivt medlemskab er taksten 500kr. årligt. Kassereren vil gerne kunne danne sig et overblik over hvor meget klubben kan forvente at få indbetalt i kontingent i alt.
    Kassereren har desuden ønsket, at systemet kan vise en oversigt over medlemmer, der er i restance.
    */
/*Medlem Kasserer = new Medlem();
*/
  //TODO: Kasserer skal kunne se en oversigt over medlemmer i restance.
  //TODO: Kasserer skal kunne se en udregning over hvor meget de kan forvente at få indbetalt i kontingent (dvs. uden dem der er i restance).
public int seIndtægt(MedlemsListe medlemsListe){

    for (Medlem m ; !m.getIRestance(); medlemsListe.getMedlemmer()){
        m.getKontingent();
    }
    int totalIndbetaling = medlemsListe.getMedlemmer()
    return totalIndbetaling;
}

}

