package arrays2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * A program that asks the user for the number of reviewers and the number of movies. Then it asks
 * the user to input a score for each movie for each reviewer. Then it calculates the average score
 * for each movie.
 */
public class Oppgave6 {
    public static void main(String[] args) {

        int numberOfReviewers = Integer.parseInt(showInputDialog("How many reviewers?"));
        int numberOfMovies = Integer.parseInt(showInputDialog("How many movies?"));

        int[][] matrix = new int[numberOfReviewers][numberOfMovies];

        String output = "";

        for (int i = 0; i < numberOfReviewers; i++) {
            for (int j = 0; j < numberOfMovies; j++) {
                matrix[i][j] = Integer.parseInt(showInputDialog("Reviewer " + (i + 1) + " movie " + (j + 1) + " score?"));
            }
        }

        for (int i = 0; i < numberOfMovies; i++) {
            double average = 0;
            for (int j = 0; j < numberOfReviewers; j++) {
                average += matrix[j][i];
            }

            average = average / numberOfReviewers;
            output += "Film " + (i + 1) + " : " + String.format("%.2f", average) + "\n";
        }
        showMessageDialog(null, output);
    }
}