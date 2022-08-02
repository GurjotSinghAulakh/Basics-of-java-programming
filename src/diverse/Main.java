package diverse;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] liste = {-3, 41, 5, -3, 2, 49};

        System.out.println(Liste.storreEnnNull(liste));
        System.out.println(Liste.forekomster(liste, 5));
        System.out.println(Liste.storst(liste));
    

        ArrayList<Ansatt> ansattListe = new ArrayList<>();

        Ansatt per = new Ansatt("per", new Dato(10, 04, 1980), new Dato(15, 10, 2018));
        Ansatt kari = new Ansatt("kari", new Dato(16, 11, 1990), new Dato(01, 12, 2022));

        ansattListe.add(per);
        ansattListe.add(kari);

        for (Ansatt a : ansattListe) {
            System.out.println(a);
        }
    }   
}
