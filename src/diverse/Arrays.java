package diverse;

public class Arrays {
    public static void main(String[] args) {
        
        // Alternative 1:
        // It prints out the numbers 1 to 25
        int teller = 1;
        while (teller <= 25) {
            System.out.println(teller);
            teller++;
        }

        // Alternative 2:
        // It prints out the numbers 1 to 25
        for (int i = 1; i <= 25; i++) {
            System.out.println(i);
        }

        // It creates an array with the numbers -3, 41, 5, -3, 2, 49.
        int[] liste = {-3, 41, 5, -3, 2, 49};
        
        // It counts the number of elements in the array that are greater than 10.
        int teller2 = 0;
        for (int i : liste) {
            if (i > 10) {
                teller2++;
            }
        }

        // It prints out the number of elements in the array that are greater than 10.
        System.out.println(teller2);


        // It prints out the even numbers in the array.
        for (int i = 0; i < liste.length; i+=2) {
            System.out.println(i);
        }

        int sum = 0;
        int teller3 = 0;

        // A for-each loop. It iterates through the array and adds the positive numbers to the sum.
        for(int tall : liste) {
            if (tall >= 0) {
                sum += tall;
                teller3++;
            }
        }

        // It prints out the sum of the positive numbers in the array and the average of the positive
        // numbers in the array.
        System.out.println(sum);
        System.out.println(sum / teller3);

    }
}

