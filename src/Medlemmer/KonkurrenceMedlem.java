package Medlemmer;

public class KonkurrenceMedlem extends Medlem {
  double konkurrenceTid;
  double træningsTid;

  public KonkurrenceMedlem(String navn, int alder, boolean aktivStatus, double medlemsnummer, boolean iRestance ) {
    super(navn, alder, aktivStatus, medlemsnummer, iRestance);
  }
}
