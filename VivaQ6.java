import java.util.ArrayList;
import java.util.Scanner;

public class vivaQ6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();
        int score;
        boolean hasNegative = false;

        System.out.println(" Enter numbers: ");

        // Collecting scores until 0 is entered
        while (true) {
            score = scanner.nextInt();
            if (score == 0) break; // Ending the round
            scores.add(score);
            if (score < 0) hasNegative = true; // Check for negative scores
        }
        
        // If no scores were entered before 0, exit the program
        if (scores.isEmpty()) {
            System.out.println("No numbers entered.");
            return;
        }

        // Variables for analysis
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        int highestCount = 0;
        int secondHighestCount = 0;
        int totalSum = 0;

        // Step 1: Find the highest score and total sum
        for (int s : scores) {
            totalSum += s;
            if (s > highest) {
                secondHighest = highest;
                secondHighestCount = highestCount;
                highest = s;
                highestCount = 1;
            } else if (s == highest) {
                highestCount++;
            } else if (s > secondHighest) {
                secondHighest = s;
                secondHighestCount = 1;
            } else if (s == secondHighest) {
                secondHighestCount++;
            }
        }

        // Display results
        System.out.println("The largest number is " + highest);
        System.out.println("The occurrence count of the largest number is " + highestCount);

        // If second-highest score exists, display it and its frequency
        if (secondHighest != Integer.MIN_VALUE) {
            System.out.println("The second-largest number is " + secondHighest);
            System.out.println("The occurrence count of the second-largest number is " + secondHighestCount);
        }

        System.out.println("The total sum of all numbers is " + totalSum);

        // Check for negative scores
        if (hasNegative) {
            System.out.println("Negative numbers were entered.");
        } else {
            System.out.println("No negative numbers were entered.");
        }

        scanner.close();
    }
}
       
