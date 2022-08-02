package introklasserogobjekter2 ;

public class Oppgave4 {
    public static void main(String[] args) {
        
        // Creating two objects of the class Klokke, and then calling the method visTiden() on each of
        // them.
        Klokke tid1 = new Klokke(11, 15, 03);
        tid1.visTiden();
        Klokke tid2 = new Klokke(02, 50, 14);
        tid2.visTiden();
    }
}

