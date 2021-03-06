//Naomi og Frederik har stået for det meste af Medlem, med input fra gruppen.

package Medlemmer;

import java.util.ArrayList;

public class Medlem {
  private String navn;
  private int alder;
  private boolean overAtten; // slet over18 hvis vi ikke bruger den
  private String medlemstype;
  private boolean aktivStatus;
  private int medlemsnummer;
  private boolean iRestance;


  public Medlem(String navn, int alder, boolean aktivStatus, int medlemsnummer, boolean iRestance) {

    this.navn = navn;
    this.alder = alder;
    this.aktivStatus = aktivStatus;
    this.medlemsnummer = medlemsnummer;
    this.iRestance = iRestance;

    if (alder >= 18) {
      overAtten = true;
      medlemstype = "senior";
    } else {
      overAtten = false;
      medlemstype = "junior";
    }
  }

  public Medlem(String member) {
    String[] params = member.split(":");
    this.navn = params[0];
    this.alder = Integer.parseInt(params[1]);
    this.aktivStatus = Boolean.parseBoolean(params[2]);
    this.medlemsnummer = Integer.parseInt(params[3]);
    this.iRestance = Boolean.parseBoolean(params[4]);

    if (alder >= 18) {
      overAtten = true;
      medlemstype = "senior";
    } else {
      overAtten = false;
      medlemstype = "junior";
    }
  }


  public String skrivMedlem() {
    return navn + ":" + alder + ":" + aktivStatus + ":" + medlemsnummer + ":" + iRestance;
  }

  public void setNavn(String navn) {
    this.navn = navn;

  }

  public String getNavn() {
    return navn;
  }

  public void setAlder(int alder) {
    this.alder = alder;

  }

  public int getAlder() {
    return alder;

  }

  public void setAktivStatus(boolean aktivStatus) {
    this.aktivStatus = aktivStatus;

  }

  public boolean getAktivStatus() {
    return aktivStatus;
  }

  public void setMedlemsnummer(int medlemsnummer) {
    this.medlemsnummer = medlemsnummer;
  }

  public int getMedlemsnummer() {
    return medlemsnummer;

  }


  public void setIRestance(boolean iRestance) {
    this.iRestance = iRestance;

  }

  public boolean getIRestance() {
    return iRestance;
  }

  @Override
  public String toString() {
    return "Medlem" + "\n" + "Navn: " + getNavn() + "\n" +
        "Alder: " + getAlder() + "\n" + "Medlemstype: " + medlemstype + "\n" + "Aktiv Status: " + getAktivStatus() + "\n" +
        "Medlemsnummer: " + getMedlemsnummer() + "\n" + " I restance: " + getIRestance();
  }

  public int getKontingent() {
    if (getAktivStatus() == false) {
      return 500;
    }
    if (getAlder() < 18) {
      return 1000;
    } else if (getAlder() > 60) {
      return 1200;
    } else {
      return 1600;
    }
  }


}
