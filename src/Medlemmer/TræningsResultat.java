package Medlemmer;

public class TræningsResultat {
    double dato;
    double svømmetid;
    public TræningsResultat(double dato, double svømmetid){
        this.dato = dato;
        this.svømmetid = svømmetid;
    }

    public double getDato() {
        return dato;
    }

    public double getSvømmetid() {
        return svømmetid;
    }
    public String skrivResultat(){
        String trainResult = getDato() + "," + getSvømmetid();
        return trainResult;
    }
    public static TræningsResultat parseTræningsResultat(String s){
        String[] params = s.split(",");
        double dato = Double.parseDouble(params[0]);
        double tid = Double.parseDouble(params[1]);
        return new TræningsResultat(dato,tid);
    }
}
