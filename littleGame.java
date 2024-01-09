import java.util.Scanner;
import java.util.Random;

public class littleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] actions = {"rock", "paper", "scissor"};
        int x = 0;
        int y = 0;

        System.out.println("Welcome to Rock Paper Scissors");
        System.out.println("Please enter your name:");
        String name = scanner.next();

        while (true) {
            int randomIndex = random.nextInt(actions.length);
            String randomAction = actions[randomIndex];
            System.out.println("Enter rock, paper, or scissor (or exit to end the game): ");
            String input = scanner.next();
            System.out.println(name + " VS Computer");
            System.out.println(name + ": " + x + " VS Computer: " + y);
            if (input.equalsIgnoreCase("exit")) {
               
                System.out.println("Exiting the game. Thanks for playing!");
                break;
            }

            if (randomAction.equals(input)) {
                System.out.println("It is a draw");
            } else if (randomAction.equals("rock")) {
                if (input.equals("paper")) {
                    System.out.println("You win!");
                    x++;
                } else if (input.equals("scissor")) {
                    System.out.println("Computer wins!");
                    y++;
                }
            } else if (randomAction.equals("paper")) {
                if (input.equals("scissor")) {
                    System.out.println("You win!");
                    x++;
                } else if (input.equals("rock")) {
                    System.out.println("Computer wins!");
                    y++;
                }
            } else if (randomAction.equals("scissor")) {
                if (input.equals("rock")) {
                    System.out.println("You win!");
                    x++;
                } else if (input.equals("paper")) {
                    System.out.println("Computer wins!");
                    y++;
                }
            }
        }

        // Close the Scanner to prevent resource leaks
        scanner.close();
    }
}
