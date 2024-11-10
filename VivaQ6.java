import java.util.Scanner;

public class vivaQ6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables for analysis
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        int highestCount = 0;
        int secondHighestCount = 0;
        int totalSum = 0;
        boolean hasNegative = false;

        System.out.println("Enter numbers: ");

        while (true) {
            int score = scanner.nextInt();

            // End input on zero
            if (score == 0) break;
            
            // Update sum
            totalSum += score;
            
            // Check if there are negative numbers
            if (score < 0) {
                hasNegative = true;
            }

            // Determine highest and second-highest scores and their counts
            if (score > highest) {
                // Update second-highest before changing highest
                secondHighest = highest;
                secondHighestCount = highestCount;
                
                // Update highest and reset count
                highest = score;
                highestCount = 1;
            } else if (score == highest) {
                highestCount++;
            } else if (score > secondHighest) {
                // Update second-highest score
                secondHighest = score;
                secondHighestCount = 1;
            } else if (score == secondHighest) {
                secondHighestCount++;
            }
        }

        // Check if no valid scores were entered
        if (highest == Integer.MIN_VALUE) {
            System.out.println("No scores entered.");
            scanner.close();
            return;
        }

        // Display results
        System.out.println("The largest number is " + highest);
        System.out.println("The occurrence count of the largest number is " + highestCount);

        // Display second-highest score if it exists
        if (secondHighest != Integer.MIN_VALUE) {
            System.out.println("The second-largest number is " + secondHighest);
            System.out.println("The occurrence count of the second-largest number is " + secondHighestCount);
        }

        System.out.println("The total sum of all numbers is " + totalSum);

        // Indicate if there were any negative numbers
        if (hasNegative) {
            System.out.println("Negative numbers were entered.");
        } else {
            System.out.println("No negative numbers were entered.");
        }

        
    }
}

       
