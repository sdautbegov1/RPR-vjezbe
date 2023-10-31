public class Korisnik extends  Osoba{
    private Racun racun;
    Korisnik(String ime, String prez){
        super(ime, prez);
    }
    public void dodajRacun(Racun r){
        racun = r;
    }
}
