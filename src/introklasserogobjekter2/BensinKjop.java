package introklasserogobjekter2 ;

public class BensinKjop {

    private String sted;
    private String type;
    private double antallLiter;
    private double prisPerLiter;
    private String tidspunkt; 

    // A constructor.
    public BensinKjop(String sted, String type, double antallLiter, double prisPerLiter, String tidspunkt) {
        this.sted = sted;
        this.type = type;
        this.antallLiter = antallLiter;
        this.prisPerLiter = prisPerLiter;
        this.tidspunkt = tidspunkt;
    }

    public String getSted() {
        return sted;
    }

    public void setSted(String sted) {
        this.sted = sted;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAntallLiter() {
        return antallLiter;
    }

    public void setAntallLiter(double antallLiter) {
        this.antallLiter = antallLiter;
    }

    public double getPrisPerLiter() {
        return prisPerLiter;
    }

    public void setPrisPerLiter(double prisPerLiter) {
        this.prisPerLiter = prisPerLiter;
    }

    public String getTidspunkt() {
        return tidspunkt;
    }

    public void setTidspunkt(String tidspunkt) {
        this.tidspunkt = tidspunkt;
    }

    /**
     * The function finnTotalPrisen() returns the product of the number of liters and the price per
     * liter
     * 
     * @return The total price of the fuel.
     */

    public double finnTotalPrisen() {
        return this.antallLiter * this.prisPerLiter;
    }
}


