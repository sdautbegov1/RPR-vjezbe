import java.util.List;

public class Banka {
    private long brojRacuna;
    List<Korisnik> korisnici;
    List<Uposlenik> uposlenici;
    public Korisnik kreirajNovogKorisnika(String ime, String prez){
        Korisnik korisnik = new Korisnik(ime, prez);
        korisnici.add(korisnik);
        return korisnik;
    }
    public Uposlenik kreirajNovogUposlenika(String ime, String prez){
        Uposlenik uposlenik = new Uposlenik(ime, prez);
        uposlenici.add(uposlenik);
        return uposlenik;
    }
    public Racun kreirajRacunZaKorisnika(Korisnik k){
        Racun racun = new Racun(brojRacuna, k);
        return racun;
    }
}
