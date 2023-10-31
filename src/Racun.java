public class Racun {
    long brojRacuna;
    Osoba korisnikRacuna;
    boolean odobrenjePrekoracenja;
    double stanjeRacuna;
    Racun(long b, Osoba os){
        brojRacuna = b; korisnikRacuna = os;
    }
    public boolean provjeriOdobrenjePrekoracenja(double a){
        return odobrenjePrekoracenja;
    }
    public boolean izvrsiUplatu(double a){
        brojRacuna += a;
        return  true;
    }
    public boolean izvrsiIsplatu(double a){
        brojRacuna -= a;
        return true;
    }
    public void odobriPrekoracenje(double x){
        odobrenjePrekoracenja = true;
    }

}
