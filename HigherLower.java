import java.util.Random;
import java.util.Scanner;

public class HigherLower {


    
    private static int ran(){
        Random rand = new Random();
        int random = rand.nextInt(100);
        if(random < 0 ){
            return random * -1;
        }
        else{
            return random;
        }
    }

    

    public static void main(String[] args) {
        int x = ran();
        Scanner scan = new Scanner(System.in);
        int y = 200;
        System.out.println("Welcome to HIgher Lower Game!");
        
        while(y!=x){
        
            boolean validInput = false;

            while(!validInput){
                System.out.println("Guess a number between 0 - 100");
                try {
                    y = Integer.parseInt(scan.nextLine());
                    validInput = true;
                } 
                catch (NumberFormatException e) {
                    System.out.println("Ungültige Eingabe. Bitte geben Sie eine ganze Zahl ein:");
                }                
                        
            }
            if(x<y){
                System.out.println("Guess lower!");
            }
            else if(x>y){
                System.out.println("Guess Higher!");
            }
            else{
                break;
            }
            
        }

        System.out.println("Congrats you won the Game!");
        
        

    }
}


