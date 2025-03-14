import java.util.Scanner;



public class Guesser {
    public static void main (String[] args) {
        Scanner scanner_variable = new Scanner(System.in);

        boolean still_running = true;

        while (still_running) {
            System.out.println("0: Stop running program");
            System.out.println("1: Human guessing mode");
            System.out.println("2: Computer guessing mode");
            int menu_choice = scanner_variable.nextInt();
            if (menu_choice == 0) {
                // end the program 
                still_running = false;
            }
            if (menu_choice == 1) {
                // call human guesser mode class
                human_guesser(scanner_variable);
            } else if (menu_choice == 2) {
                // call computer guesser mode class
                computer_guesser(scanner_variable);
            } else {
                // call computer guesser mode class
                System.out.println("That is not a menu option, please type a number");
            } // end of menu choice if statements
        } // end of menu loop

    } // end of main class
    public static void human_guesser (Scanner scanner_variable) {
        System.out.println("You are now in the human guesser class");
        int correct_number = (int) (Math.random() * 100) + 1;
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
        int low = 1;
        int max = 100;
        System.out.println("The current max is: " + max);
        System.out.println("The current low is: " + low);
        
        boolean repeat_variable = true;

        while (repeat_variable) {
            int guess = (low + max) / 2;
            System.out.println("My current guess is " + guess);
            System.out.println("If my guess is too low, respond with `L`");
            System.out.println("If my guess is too high, respond with `H`");
            System.out.println("If my guess correct , respond with `C`");
            System.out.println("");
            System.out.println("what is your response?");
            String current_guess = scanner_variable.nextLine();
            System.out.println("");
            if (current_guess.equals("L")) {
                low = guess + 1;
            } else if (current_guess.equals("H")) {
                max = guess - 1;
            } else if (current_guess.equals("C")) {
                System.out.println("I got it correct. Woo hoo!");
                repeat_variable = false;
            }



        }

        System.out.println("The current low is: " + low);

    } // end of computer number guessing class 
} // end of guesser class


