import java.util.ArrayList;
import java.util.List;

public class BinarySearchEfficiency {
    // playing around testing Efficiency for BinarySearch Algo

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int randomnum = 1; randomnum <= 100; randomnum++) {
            int guess = 50;
            int max = 100;
            int min = 0;
            int i = 0;
            while (randomnum != guess) {
                guess = (min + max) / 2;
                if (randomnum < guess) {
                    max = guess - 1;
                } else if (randomnum > guess) {
                    min = guess + 1;
                }
                i = i + 1;
            }
            numbers.add(i);
        }
        System.out.println(numbers);
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        double average = (double) sum / numbers.size();
        System.out.println("The average is: " + average);
    }
}
