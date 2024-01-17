
import java.util.Scanner;

public class NumberGuessing {
    
    public static void main(String[] args) {
        System.out.println("Let's play a game. I'll pick a number between");
        System.out.println("1 and 100, and you try to guess it.");
        
        Scanner scanner = new Scanner(System.in); 
        
        boolean playAgain;
        
        do {
            playGame();  
            
            System.out.println("Would you like to play again? Y/N");
            
            String playAgainStr = scanner.next();
            playAgain = playAgainStr.equalsIgnoreCase("Y");
        } while (playAgain);
      
        System.out.println("Thanks for playing. Goodbye.");
        scanner.close();
    }
    
    static void playGame() {
        int computersNumber; // The number the computer has chosen
        int usersGuess;      // The user's current guess
        int guessCount;      // The number of guesses the user has made
        
        computersNumber = (int)(100 * Math.random()) + 1;

        guessCount = 0;
        
        System.out.println();
        System.out.println("What is your first guess?");

        Scanner sc= new Scanner(System.in);   
        
        while (true) {
            usersGuess = sc.nextInt(); 
            
            guessCount++;
            
            if (usersGuess == computersNumber) {
                System.out.println("You got it in " + guessCount + " guesses! My number was " + computersNumber);
                break;  
            }
            
            if (guessCount == 6) {
                System.out.println("You didn't get the number in 6 guesses.");
                System.out.println("You lose. My number was " + computersNumber);
                break;  
            }
            
            if (usersGuess < computersNumber) {
                System.out.println("Your number is too low. Try again:");
            }
            
            else if (usersGuess > computersNumber) {
                System.out.println("Your number is too high. Try again:");
            }
        }
        sc.close();
        System.out.println();
    } 
}

