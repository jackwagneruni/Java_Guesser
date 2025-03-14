import java.util.Scanner;



public class Guesser {
    public static void main (String[] args) {
        Scanner scanner_variable = new Scanner(System.in);

        boolean still_running = true;

        while (still_running) {
            System.out.println("0: Stop running program");
            System.out.println("1: Human guessing mode");
            int menu_choice = scanner_variable.nextInt();
            if (menu_choice == 0) {
                // end the program 
                still_running = false;
            }
            if (menu_choice == 1) {
                // call human guesser mode class
                human_guesser(scanner_variable);
            }
            if (menu_choice == 2) {
                // call computer guesser mode class
                still_running = false;
            }
        } // end of 

    }
    public static void human_guesser (Scanner scanner_variable) {
        System.out.println("You are now in the human guesser class");
        int correct_number = 38;
    
        System.out.println("Correct number is " + correct_number);
        
        boolean repeat_guessing_loop = true;
        
        while (repeat_guessing_loop) {
            System.out.println("What is your guess?");
            int current_guess = scanner_variable.nextInt();
            System.out.println("You guessed: " + current_guess);
            
            if (current_guess == correct_number) {
                System.out.println("you got it!");
                repeat_guessing_loop = false;
            } else if (current_guess > correct_number) {
                System.out.println("your guess was too large");
            }
            else if (current_guess < correct_number) {
                System.out.println("your guess was too small");
            } // end of if statements
            
        } // end of human guessing number loop


    } // end of human guessing class
    
    
    
    
    public static void computer_guesser (Scanner scanner_variable) {
        System.out.println("Now you are in the computer guesser class");
        int correct_number = 38;
        System.out.println("Correct number is " + correct_number);

        

    } // end of computer number guessing class 
} // end of guesser class


