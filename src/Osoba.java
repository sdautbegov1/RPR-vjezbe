public class Osoba {
    private String ime;
    private String prezime;
    Osoba(){ this("Nepoznata", "Osoba"); };
    Osoba(String ime, String prez){
        this.ime = ime; this.prezime = prez;
    }
    public String toString(){
        return ime + " " + prezime;
    }

}
