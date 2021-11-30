package Medlemmer;

public class KonkurrenceResultat {
    String stævne;
    double svømmetid;
    int placering;
    //TODO: formattering
    public KonkurrenceResultat(){


    }
    public String skrivResultat(){
        String resultat = stævne + "," + svømmetid + "," + placering + ";";
        return resultat;
    }
}
//