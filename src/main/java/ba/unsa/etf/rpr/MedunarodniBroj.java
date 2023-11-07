package ba.unsa.etf.rpr;

import java.util.*;
public class MedunarodniBroj extends TelefonskiBroj{
    private String drzava;
    private String broj;

    MedunarodniBroj(String drzava, String broj){
        this.drzava = drzava;
        this.broj = broj;
    }
    @Override
    public String ispisi(){
        return drzava + "/" + broj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(drzava, broj);
    }

}
