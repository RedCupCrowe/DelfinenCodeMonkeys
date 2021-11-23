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
}
