import java.util.Scanner;

public class BinarySearch{
    //small program to get a better understanding of binary Search, like Higher Lower just in reverse. 
    

    public static void main(String[] args) {
        int guess;
        int max = 100;
        int min = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, think of a number between 0, 100!");
        System.out.println("Got it? I will now give you a number you will tell me if it's higher (h), lower (l), or correct (c)");
        String input = "b";
        while(!input.equals("c")){

            guess = (min + max)/2;
            System.out.println("Is your number " + guess );
            input = scan.nextLine();
            System.out.println(input);
            if(input.equals("h")){
                min = guess +1;
            }
            else if(input.equals("l")){
                max = guess -1;
            }


        }
        


    }
}