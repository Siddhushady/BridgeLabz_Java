package CoreProgramming.String.Level2;

import java.util.Scanner;

public class RockPaperScissors {

    // Get computer choice
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "rock";
        if (choice == 1) return "paper";
        return "scissors";
    }

    // Find winner
    public static String findWinner(String user, String computer) {

        if (user.equals(computer)) return "Draw";

        if (user.equals("rock") && computer.equals("scissors") ||
                user.equals("paper") && computer.equals("rock") ||
                user.equals("scissors") && computer.equals("paper")) {
            return "User";
        }
        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games : ");
        int games = sc.nextInt();

        int userWins = 0, computerWins = 0;

        for (int i = 1; i <= games; i++) {

            System.out.print("Enter your choice (rock/paper/scissors) : ");
            String userChoice = sc.next();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            System.out.println("Computer choice : " + computerChoice);
            System.out.println("Winner : " + winner);

            if (winner.equals("User")) userWins++;
            if (winner.equals("Computer")) computerWins++;
        }

        System.out.println("\n--- Game Statistics ---");
        System.out.println("User Wins : " + userWins);
        System.out.println("Computer Wins : " + computerWins);
        System.out.println("User Win % : " + (userWins * 100 / games));
        System.out.println("Computer Win % : " + (computerWins * 100 / games));
    }
}
