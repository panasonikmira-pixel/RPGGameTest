import java.util.Scanner;

class Character {
    private String name;
    private int level;
    private int hp;

    public Character(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    public void animalSound() {
        System.out.println("The character makes a sound.");
    }
}




class Warrior extends Character {
    public Warrior(String name, int level, int hp) {
        super(name, level, hp);
    }

    @Override
    public void animalSound() {
        System.out.println("The Warrior says: roar!");
    }
}





class Mage extends Character {
    public Mage(String name, int level, int hp) {
        super(name, level, hp);
    }

    @Override
    public void animalSound() {
        System.out.println("The Mage says: bow wow");
    }
}





class Cleric extends Character {
    public Cleric(String name, int level, int hp) {
        super(name, level, hp);
    }

    @Override
    public void animalSound() {
        System.out.println("The Cleric says: bow wow");
    }
}




public class strona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose class: 1-Warrior, 2-Mage or 3-Cleric");
        String classChoice = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter lvl: ");
        int level = scanner.nextInt();

        System.out.print("Enter hp: ");
        int hp = scanner.nextInt();

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

        System.out.println("\nYour character:");
        player.animalSound();
    }
}