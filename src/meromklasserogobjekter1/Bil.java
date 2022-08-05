package meromklasserogobjekter1;

public class Bil {
    public String typeBetegnelse;
    public Dato forstegangsReg;
    public String kjennetegn;

    public Bil(String typeBetegnelse, Dato forstegangsReg, String kjennetegn) {
        this.typeBetegnelse = typeBetegnelse;
        this.forstegangsReg = forstegangsReg;
        this.kjennetegn = kjennetegn;
    }

    /**
     * It returns a string that contains the type of car, the registration number and the license plate
     * number
     * 
     * @return The method returns a String.
     */

    public String toString(){
        String utskrift = "Bilen er en " + typeBetegnelse + " med forstegangsregistreringsnummer " + forstegangsReg + " og kjennetegn " + kjennetegn + ".";
        return utskrift;
    }
}
