package Medlemmer;

public class KonkurrenceResultat {
    String stævne;
    double svømmetid;
    int placering;
    //TODO: formattering
    public KonkurrenceResultat(String stævne, double svømmetid, int placering){
        this.stævne = stævne;
        this.svømmetid = svømmetid;
        this.placering = placering;

    }
    public String getStævne(){
        return stævne;
    }

    public double getSvømmetid() {
        return svømmetid;
    }
    public int getPlacering(){
        return placering;
    }

    public static KonkurrenceResultat parseKonkurrenceResultat(String sk){
        String[] params = sk.split(",");
        String stævne = params[0];
        double svømmetid = Double.parseDouble(params[1]);
        int placering = Integer.parseInt(params[2]);
        return new KonkurrenceResultat(stævne,svømmetid,placering);
    }

    public String skrivResultat(){
        String resultat = stævne + "," + svømmetid + "," + placering + ";";
        return resultat;
    }
}
//