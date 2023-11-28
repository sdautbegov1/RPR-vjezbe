package ba.unsa.etf.rpr;

public class Ocjena {
    private LicneInformacije osoba;
    private int ocjena;
    Ocjena(LicneInformacije o, int x){
        this.osoba.setIme(o.getIme());
        this.osoba.setPrezime(o.getPrezime());
        this.ocjena = x;
    }
    void setOcjena(int x){
        if(x > 0 && x < 10) this.ocjena = x;
        else this.ocjena = 0;
    }
}
