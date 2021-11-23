package Bruger;
import java.util.Scanner;

public class Kasserer {
    /*
    Klubbens kasserer tager sig af alt vedrørende kontingentbetaling.
    Kontingentets størrelse er betinget af flere forhold:For aktive medlemmer er kontingentet for ungdomssvømmere (under 18 år) 1000 kr. årligt, for senior svømmere (18år og over)1600kr.
    årligt. For medlemmer over 60 år gives der 25% rabat af seniortaksten.
    For passivt medlemskab er taksten 500kr. årligt. Kassereren vil gerne kunne danne sig et overblik over hvor meget klubben kan forvente at få indbetalt i kontingent i alt.
    Kassereren har desuden ønsket, at systemet kan vise en oversigt over medlemmer, der er i restance.
    */
int kontingentUngdom = 1000;
int kontingentSenior = 1600;
int kontingentOldings = 1200;

if (alder < 18) {
        System.out.println("Kontingent er " + kontingentUngdom);
    } else if (alder > 18 && alder < 60){
        System.out.println("Kontingent er " + kontingentSenior);
    } else {
        System.out.println("Kontingent er " + kontingentOldings);
    }
}
