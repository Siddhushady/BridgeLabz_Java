package coreprogramming.String.Level2;

import java.util.Scanner;

/**
 * RockPaperScissors class implements a Rock-Paper-Scissors game using string comparison methods.
 * The program demonstrates string manipulation and game logic by creating methods to generate
 * random computer choices and determine winners based on game rules. It plays multiple games,
 * tracks wins, and displays statistics including win percentages.
 */
public class RockPaperScissors {

    /**
     * Generates a random computer choice for Rock-Paper-Scissors.
     * @return Random choice: "rock", "paper", or "scissors"
     */
    public static String getComputerChoice() {
        // Generating random number 0, 1, or 2
        int choice = (int) (Math.random() * 3);
        // Returning "rock" for 0
        if (choice == 0) return "rock";
        // Returning "paper" for 1
        if (choice == 1) return "paper";
        // Returning "scissors" for 2
        return "scissors";
    }

    /**
     * Determines the winner of a Rock-Paper-Scissors game.
     * @param user User's choice
     * @param computer Computer's choice
     * @return "Draw", "User", or "Computer"
     */
    public static String findWinner(String user, String computer) {

        // Checking if both choices are the same (draw)
        if (user.equals(computer)) return "Draw";

        // Checking winning conditions: rock beats scissors, paper beats rock, scissors beats paper
        if (user.equals("rock") && computer.equals("scissors") ||
                user.equals("paper") && computer.equals("rock") ||
                user.equals("scissors") && computer.equals("paper")) {
            return "User";
        }
        // If user didn't win and it's not a draw, computer wins
        return "Computer";
    }

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter number of games
        System.out.print("Enter number of games : ");
        // Reading number of games from user
        int games = sc.nextInt();

        // Initializing win counters
        int userWins = 0, computerWins = 0;

        // Loop to play multiple games
        for (int i = 1; i <= games; i++) {

            // Prompting user to enter their choice
            System.out.print("Enter your choice (rock/paper/scissors) : ");
            // Reading user's choice
            String userChoice = sc.next();

            // Calling method to get computer's random choice
            String computerChoice = getComputerChoice();
            // Calling method to determine winner
            String winner = findWinner(userChoice, computerChoice);

            // Displaying computer's choice
            System.out.println("Computer choice : " + computerChoice);
            // Displaying winner of this game
            System.out.println("Winner : " + winner);

            // Incrementing user wins if user won
            if (winner.equals("User")) userWins++;
            // Incrementing computer wins if computer won
            if (winner.equals("Computer")) computerWins++;
        }

        // Displaying game statistics
        System.out.println("\n--- Game Statistics ---");
        System.out.println("User Wins : " + userWins);
        System.out.println("Computer Wins : " + computerWins);
        // Calculating and displaying user win percentage
        System.out.println("User Win % : " + (userWins * 100 / games));
        // Calculating and displaying computer win percentage
        System.out.println("Computer Win % : " + (computerWins * 100 / games));
    }
}
