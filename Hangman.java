import java.util.Random;
import java.util.Scanner;

public class Hangman {
    private static String[] words = {"computer", "programming", "software", "algorithm", "database", "networking", "cybersecurity", "encryption", "java", "python", "javascript", "html", "css", "artificial", "intelligence", "machine", "learning", "data", "structure", "function"};
    private static Random random = new Random();
    private static String word = words[random.nextInt(words.length)];
    private static int guessesLeft = 6;
    private static StringBuilder guessedLetters = new StringBuilder();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (guessesLeft > 0) {
            System.out.print(word);
            System.out.println("Guess a letter! ");
            String guess = scan.nextLine();

            if (guess.length() != 1) {
                continue;
            }

            if (guessedLetters.indexOf(guess) == -1) {
                guessedLetters.append(guess);
            } else {
                System.out.println("You already guessed this letter!");
                continue;
            }
            if(!(word.indexOf(guess) != -1 )){
                guessesLeft--;
            }

            boolean wordguessed = true;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (guessedLetters.indexOf(Character.toString(c)) != -1) {
                    System.out.print(c + " ");
                } else {
                    System.out.print("_ ");
                    wordguessed = false;
                }
            }
            System.out.println();

            if (wordguessed) {
                System.out.println("You won");
                break;
            }

            System.out.println("Guesses left: " + guessesLeft);
        }

        if (guessesLeft == 0) {
            System.out.println("You lost. The word was: " + word);
        }
    }
}
