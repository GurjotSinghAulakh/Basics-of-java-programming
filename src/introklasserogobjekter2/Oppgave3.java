package introklasserogobjekter2 ;

public class Oppgave3 {
    public static void main(String[] args) {

        // It creates a new object of the class BensinKjop.
        BensinKjop bensinkjop = new BensinKjop("Asker", "Bensin", 13, 20.43, "11:15");

        // Calling the method `finnTotalPrisen()` from the class `BensinKjop` and storing the result in the variable `pris`.
        double pris = bensinkjop.finnTotalPrisen();


        // Printing out the result of the method `finnTotalPrisen()` from the class `BensinKjop`
        String prisToDesimaler = String.format("%.2f", pris);
        String ut = "Det kostet totalt " + prisToDesimaler+" kr i " + bensinkjop.getSted() +
                " kl " + bensinkjop.getTidspunkt();

        System.out.println(ut);
    }
}
