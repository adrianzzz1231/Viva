import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class vivaQ6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();
        boolean hasNegative = false;
        int totalSum = 0;

        System.out.println("Enter numbers (end input with 0):");

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) break;

            scores.add(number);
            totalSum += number;

            if (number < 0) {
                hasNegative = true;
            }
        }

        if (scores.isEmpty()) {
            System.out.println("No numbers were entered.");
            return;
        }

        int maxScore = Collections.max(scores);
        int maxScoreCount = Collections.frequency(scores, maxScore);

        scores.removeAll(Collections.singleton(maxScore));

        int secondMaxScore = scores.isEmpty() ? -1 : Collections.max(scores);
        int secondMaxScoreCount = secondMaxScore != -1 ? Collections.frequency(scores, secondMaxScore) : 0;

        System.out.println("The largest number is " + maxScore);
        System.out.println("The occurrence count of the largest number is " + maxScoreCount);
        
        if (secondMaxScore != -1) {
            System.out.println("The second-largest number is " + secondMaxScore);
            System.out.println("The occurrence count of the second-largest number is " + secondMaxScoreCount);
        } else {
            System.out.println("There is no second-largest number.");
        }

        System.out.println("The total sum of all numbers is " + totalSum);

        if (hasNegative) {
            System.out.println("Negative numbers were entered.");
        } else {
            System.out.println("No negative numbers were entered.");
        }

        scanner.close();
    }
}
