package ba.unsa.etf.rpr;

import java.util.List;

public class InformacijeONastavniku extends LicneInformacije {
     private String titula;
     private List<Ocjena> ocjene;

    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }
}
