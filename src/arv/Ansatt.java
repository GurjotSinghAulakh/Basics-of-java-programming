package arv;

public class Ansatt extends Person{
    private String fagfelt;
    private int ansattnr;
   

    public Ansatt(String navn, int alder, String email, String fagfelt, int ansattnr){
        super(navn, alder, email);
        this.fagfelt = fagfelt;
        this.ansattnr = ansattnr;
    }

    public String getFagfelt() {
        return fagfelt;
    }

    public void setFagfelt(String fagfelt) {
        this.fagfelt = fagfelt;
    }

    public int getAnsattnr() {
        return ansattnr;
    }

    public void setAnsattnr(int ansattnr) {
        this.ansattnr = ansattnr;
    }

    @Override
    String getSkole() {
        return "OsloMet";
    }

    @Override
    public void skrivSkole() {
        System.out.println("Skole: " + getSkole());
    }

    @Override
    public String toString() {
        return "Ansatt: \n" + super.toString() + ", Fagfelt: " + fagfelt + ", Ansattnr: " + ansattnr + "\n";
    }
}



