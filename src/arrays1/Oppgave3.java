

package arrays1;

/**
 * It prints out the names in the array in pairs
 */

 public class Oppgave3 {
    public static void main(String[] args) {
        String[] names = {"Per", "Ola", "Kari", "Knut", "Kari", "Knut"};
        
        for (int i = 0; i < names.length; i += 2) {
            System.out.println(names[i] + " og " + names[i+1]);
        }
    }
}