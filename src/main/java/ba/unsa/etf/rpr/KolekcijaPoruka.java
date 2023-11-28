package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class KolekcijaPoruka {
    List<String> poruke;
    public KolekcijaPoruka(List<String> l) {
        this.poruke = new ArrayList<>();
        for (String s : poruke) {
            this.poruke.add(s.predstavi());
        }
    }

    public List<String> get() {
        return this.poruke;
    }
}
