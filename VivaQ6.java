import java.util.Scanner;

public class vivaQ6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        int highestCount = 0;
        int secondHighestCount = 0;
        int sum = 0;
        boolean negativePresent = false;

        System.out.println("Enter numbers (end with 0)");

        while (true) {
            int score = scanner.nextInt();

            // Exit condition when score is 0
            if (score == 0) break;

            // Update the sum of all scores
            sum += score;

            // Check for negative scores
            if (score < 0) {
                negativePresent = true;
            }

            // Update highest and second highest scores and their counts
            if (score > highest) {
                secondHighest = highest;
                secondHighestCount = highestCount;

                highest = score;
                highestCount = 1;
            } else if (score == highest) {
                highestCount++;
            } else if (score > secondHighest) {
                secondHighest = score;
                secondHighestCount = 1;
            } else if (score == secondHighest) {
                secondHighestCount++;
            }
        }

        // Display results
        System.out.println("The largest number is " + highest);
        System.out.println("The occurrence count of the largest number is " + highestCount);

        if (secondHighest != Integer.MIN_VALUE) {
            System.out.println("The second-largest number is " + secondHighest);
            System.out.println("The occurrence count of the second-largest number is " + secondHighestCount);
        } else {
            System.out.println("No second-highest number found.");
        }

        System.out.println("The total sum of all numbers is " + sum);

        if (negativePresent) {
            System.out.println("Negative numbers were entered.");
        } else {
            System.out.println("No negative numbers were entered.");
        }

        
    }
}
