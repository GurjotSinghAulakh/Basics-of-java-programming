package meromklasserogobjekter1;

public class MotovognReg {
    public static void main(String[] args) {
        
        // Creating an array of objects of type Bil.
        Bil[] register = new Bil[10];


        Dato dato1 = new Dato(1, 1, 2000);
        Dato dato2 = new Dato(4, 6, 2001);

        Bil volvo = new Bil("Volvo", dato1, "EV 12345");
        Bil saab = new Bil("Saab", dato2, "EV 54321");
        
        register[0] = volvo;
        register[1] = saab;

        // Iterating through the array and printing out the objects.
        for (Bil enBil : register) {
            if (enBil != null) {
                System.out.println(enBil);
            }
        }
    }
}
