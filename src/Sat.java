public class Sat {
    public int sati;
    public int minute;
    public int sekunde;

    public Sat(int h, int min, int s){
        this.postavi(h, min, s);
    }
    public void postavi(int h, int min, int s){
        this.sati = h;
        this.minute = min;
        this.sekunde = s;
    }

    public void sljedeci(){
        this.sekunde++;
        if (this.sekunde==60) { this.sekunde=0; this.minute++; }
        if (this.minute==60) { this.minute=0; this.sati++; }
        if (this.sati==24) this.sati=0;
    }
    public void prethodni() {
        this.sekunde--;
        if (this.sekunde==-1) { this.sekunde=59; this.minute--; }
        if (this.minute==-1) { this.minute=59; this.sati--; }
        if (this.sati==-1) this.sati=23;
    }
    public void pomjeriZa(int pomak) {
        if (pomak>0) for (int i = 0; i<pomak; i++) this.sljedeci();
        else for (int i = 0; i<-pomak; i++) this.prethodni(); //moze i prethodni()
    }
    public int dajSate()  { return this.sati; }
    public int dajMinute()  { return this.minute; }
    public int dajSekunde()  { return this.sekunde; }
    public void ispisi()  { System.out.println(this.sati + ":" + this.minute + ":" + this.sekunde);
    }
    public String toString(){
        //return new StringBuilder().append(this.sati).append(":").append(this.minute).append(":").append(this.sekunde).toString(); //bolje
        return this.sati+":"+this.minute+":"+this.sekunde;
    }

    public static void main(String[] args){
        Sat s = new Sat(15, 30, 40);
        s.ispisi();
        s.sljedeci();
        s.ispisi();
        System.out.println(s);
        s.pomjeriZa(-48);
        s.ispisi();
        s.postavi(0, 0, 0);
        s.ispisi();

    }


}
