package Medlemmer;

import Bruger.Formand;

import java.util.ArrayList;

public class KonkurrenceMedlem extends Medlem {
  private double konkurrenceTid;
  private double træningsTid;
  private TræningsResultat butterflyTid;
  private TræningsResultat crawlTid;
  private TræningsResultat rygCrawlTid;
  private TræningsResultat brystTid;
  private Boolean[] discipliner = {false,false,false,false};
  private ArrayList<KonkurrenceResultat> konkurrenceResultater = new ArrayList<>();

  //butterfly,crawl,rygcrawl og brystsvømning
  public KonkurrenceMedlem(String navn, int alder, boolean aktivStatus, int medlemsnummer, boolean iRestance) {
    super(navn, alder, aktivStatus, medlemsnummer, iRestance);
  }

  public static KonkurrenceMedlem parseKonkurrenceMedlem(String str){
    String[] params = str.split(":");
    KonkurrenceMedlem medlem = new KonkurrenceMedlem(params[0], Integer.parseInt(params[1]),Boolean.parseBoolean(params[2]), Integer.parseInt(params[3]), Boolean.parseBoolean(params[4]));
    medlem.registrerButterflyTid(TræningsResultat.parseTræningsResultat(params[5]));
    medlem.registrerCrawlTid(TræningsResultat.parseTræningsResultat(params[6]));
    medlem.registrerRygCrawlTid(TræningsResultat.parseTræningsResultat(params[7]));
    medlem.registrerBrystTid(TræningsResultat.parseTræningsResultat(params[8]));
    medlem.registrerKonkurrenceResultat(KonkurrenceResultat.parseKonkurrenceResultat(params[9]));
    return medlem;
  }

  public void tilmeldDisciplin(int disciplin) {
    discipliner[disciplin -1] = true;
  }
  public void registrerButterflyTid(TræningsResultat resultat) {
    if (butterflyTid == null || butterflyTid.getSvømmetid() > resultat.getSvømmetid()) {
      this.butterflyTid = resultat;
    }
  }


  public void registrerCrawlTid(TræningsResultat resultat) {
    if (crawlTid == null || crawlTid.getSvømmetid() > resultat.getSvømmetid()) {
      this.crawlTid = resultat;
    }
  }

  public void registrerRygCrawlTid(TræningsResultat resultat) {
    if (rygCrawlTid == null || rygCrawlTid.getSvømmetid() > resultat.getSvømmetid()) {
      this.rygCrawlTid = resultat;
    }
  }

  public void registrerBrystTid(TræningsResultat resultat) {
    if (brystTid == null || brystTid.getSvømmetid() > resultat.getSvømmetid()) {
      this.brystTid = resultat;
    }

  }
//TODO: find en måde at lave en tostring på et arraylist.
  public void registrerKonkurrenceResultat(KonkurrenceResultat resultat){
    if (!konkurrenceResultater.contains(resultat)){
      konkurrenceResultater.add(resultat);
    }
  }
  //TODO: lav override til konkurrencemedlem, da den skal have mere information med.
  // evt. navn:alder:status:nr:restance:butterflytid:crawltid:rygcrawltid:brysttid:stævne,svømmetid,placering;stævne,svømmetid,placering;stævne,svømmetid,placering;
  @Override
  public String skrivMedlem(){
    String str = getNavn() + ":" + getAlder() + ":" + getAktivStatus() + ":" + getMedlemsnummer() + ":" + getIRestance()
            + butterflyTid.skrivResultat() + ":" + crawlTid.skrivResultat() +":" + rygCrawlTid.skrivResultat() +":"+brystTid.skrivResultat() +":";

    for (KonkurrenceResultat r: konkurrenceResultater){
      str += r.skrivResultat();
    }

      return str;

  }
}
