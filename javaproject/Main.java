import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Hello");
        System.out.println("Choose option:");
        System.out.println("1 - Create character");
        System.out.print("Your choice: ");
        String choice = scanner.nextLine();

        if (choice.equals("1")) {
   
            System.out.println("Choose class: 1-Warrior, 2-Mage or 3-Cleric");
            String classChoice = scanner.nextLine();

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter lvl: ");
            int level = scanner.nextInt();

            System.out.print("Enter hp: ");
            int hp = scanner.nextInt();
            scanner.nextLine(); 

            Character player;

            switch (classChoice) {
                case "1":
                    player = new Warrior(name, level, hp);
                    break;
                case "2":
                    player = new Mage(name, level, hp);
                    break;
                case "3":
                    player = new Cleric(name, level, hp);
                    break;
                default:
                    System.out.println("sozdan normis");
                    player = new Character(name, level, hp);
            }

            System.out.println("Your character:");
            player.CharacterSound();

            boolean continueGame = true;

            while (continueGame) {
                System.out.println("Choose option:");
                System.out.println("1 - Gambling");
                System.out.println("2 - figth");
                System.out.println("3 - exit");
                System.out.print("Your choice: ");
                String actionChoice = scanner.nextLine();

                switch (actionChoice) {
                    case "1":
                        playDiceGame(scanner, random);
                        break;
                    case "2":
                        Goul goul = new Goul("Ken", 5, 80);
                        Battle battle = new Battle(player, goul);
                        battle.startFight();
                        break;
                    case "3":
                        System.out.println("bye buy");
                        continueGame = false;
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }


        } else {
            System.out.println("Invalid choice");
        }
    }

    public static void playDiceGame(Scanner scanner, Random random) {
    int coins = 100;
    System.out.println("Dice Game:");
    System.out.println("You will play against the OLDgambler");
    System.out.println("Type 'exit' anytime to leave the game");

    while (coins > 0) {
        System.out.println("Press Enter to roll the dice or type 'exit' to quit:");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("exit")) {
            System.out.println("You chose to exit the game");
            return;
        }

        int playerRoll = random.nextInt(6) + 1;
        System.out.println("You rolled a " + playerRoll);

        System.out.println("OLDgambler's turn");
        int robotRoll = random.nextInt(6) + 1;
        System.out.println("OLDgambler rolled a " + robotRoll);

        if (playerRoll > robotRoll) {
            coins += 10;
            System.out.println("You win. Your money: " + coins);
        } else if (robotRoll > playerRoll) {
            coins -= 25;
            System.out.println("OLDgambler wins. Your money: " + coins);
        } else {
            System.out.println("Draw.");
        }
    }

    System.out.println("Game over. You need credits.");
}
}