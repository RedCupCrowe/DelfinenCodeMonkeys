package Medlemmer;

import java.util.ArrayList;

public class KonkurrenceMedlem extends Medlem {
  private double konkurrenceTid;
  private double træningsTid;
  private TræningsResultat butterflyTid;
  private TræningsResultat rygcrawlTid;
  private TræningsResultat crawlTid;
  private TræningsResultat brystTid;
  private ArrayList<KonkurrenceResultat> konkurrenceResultater = new ArrayList<>();

  //butterfly,crawl,rygcrawl og brystsvømning
  public KonkurrenceMedlem(String navn, int alder, boolean aktivStatus, int medlemsnummer, boolean iRestance) {
    super(navn, alder, aktivStatus, medlemsnummer, iRestance);
  }

  public void tilmedDisciplin() {

  }

  public void registrerBrystTid(TræningsResultat resultat) {
    if (brystTid == null || brystTid.getSvømmetid() > resultat.getSvømmetid()) {
      this.brystTid = resultat;
    }
  }

  public void registrerCrawlTid(TræningsResultat resultat) {
    if (crawlTid == null || crawlTid.getSvømmetid() > resultat.getSvømmetid()) {
      this.crawlTid = resultat;
    }
  }

  public void registrerKonkurrenceResultat(KonkurrenceResultat resultat){
    if (!konkurrenceResultater.contains(resultat)){
      konkurrenceResultater.add(resultat);
    }
  }
}
