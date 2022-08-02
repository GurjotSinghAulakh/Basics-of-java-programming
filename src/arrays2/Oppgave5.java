package arrays2;

/**
 * It prints out the average rating for each movie
 */

public class Oppgave5 {
    public static void main(String[] args) {
        int[][] matrix = {{4,6,2,5}, {7,9,4,8}, {6,9,3,7}};
        
        // Printing out the matrix.
        String output = "";
        for (int i = 0; i < 3; i++){
            output += "Reviewer " + (i+1) + " : ";
            for (int j = 0; j < 4; j++){
                output += matrix[i][j] + " ";
            }
            output += "\n";
        }

        System.out.println(output);


        // Calculating the average rating for each movie.
        double average;
        output = "The average is: \n";

        for (int i = 0; i < 4; i++){
            average = 0;

            for (int j = 0; j < 3; j++){
                average += matrix[j][i];
            }

            average = average / 3;
            output += "Film " + (i+1) + " : " + String.format("%.2f", average) + "\n";
        }

        System.out.println(output);
    }
}