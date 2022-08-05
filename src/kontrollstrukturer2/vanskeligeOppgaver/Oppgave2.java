package kontrollstrukturer2.vanskeligeOppgaver;

public class Oppgave2 {
    public static void main(String[] args) {
        
        int n = 100;
        int i = 1;

        /********************************** Alternative 1: **********************************************/


        // Checking if the number is a prime number.
        while (i <= n) {
            int c = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }
            }

            if (c == 2) {
                System.out.println(i);
            }

            i++;
        }
    } 


        /********************************** Alternative 2: **********************************************/

        /** 
        // Checking if the number is a prime number.
        for (int i = 0 ; i < n; i++) {
            if (primtall(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean primtall(int n) {
        
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    **/
}
