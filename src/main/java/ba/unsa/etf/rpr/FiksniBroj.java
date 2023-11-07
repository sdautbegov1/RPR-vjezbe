package ba.unsa.etf.rpr;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj {
    private Grad grad;
    private String broj;

    FiksniBroj(Grad grad ,String broj) throws Izuzetak {
        if(grad == null) throw new Izuzetak("Neispravan pozivni broj za fiksni telefon!");
        this.grad=grad;
        this.broj=broj;
    }
    @Override
    public int hashCode() {
        return Objects.hash(grad, broj);
    }

    @Override
    public String ispisi(){
        return grad.getPozivniBroj()+"/"+broj;
    }

    public Grad getGrad() {
        return grad;
    }



}
