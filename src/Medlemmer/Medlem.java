package Medlemmer;

public class Medlem {
  private String navn;
  private int alder;
  private boolean aktivStatus;
  private double medlemsnummer;
  private boolean iRestance;


  public Medlem (String navn, int alder, boolean aktivStatus, double medlemsnummer, boolean iRestance){

    this.navn = navn;
    this.alder = alder;
    this.aktivStatus = aktivStatus;
    this.medlemsnummer = medlemsnummer;
    this.iRestance = iRestance;


  }
  public void setNavn(String navn){
    this.navn = navn;

  }
  public String getNavn(){
    return navn;
  }
  public void setAlder(int alder){
    this.alder = alder;

  }
  public int getAlder(){
    return alder;

  }
  public void setAktivStatus(boolean aktivStatus){
    this.aktivStatus = aktivStatus;

  }
  public boolean getAktivStatus(){
    return aktivStatus;
  }

  public void setMedlemsnummer(double medlemsnummer){
    this.medlemsnummer = medlemsnummer;
  }
  public double getMedlemsnummer(){
    return medlemsnummer;

  }

  public void setIRestance(boolean iRestance){
    this.iRestance = iRestance;

  }

  public boolean getIRestance(){
    return iRestance;
  }

  @Override
  public String toString(){
    return "Medlem" + "\n" + "Navn: " + getNavn() + "\n" +
            "Alder: " + getAlder() + "\n" + "Aktiv Status: " + getAktivStatus() + "\n" +
            "Medlemsnummer: " + getMedlemsnummer() + "\n" + " I restance: " + getIRestance();
  }
 public int getKontingent(){
    if (getAktivStatus() == false){
      return 500;

    }
    if (getAlder() < 18){
      return 1000;
    }else if(getAlder() > 60){
      return 1200;
   }else{
      return 1600;
    }
 }



}
