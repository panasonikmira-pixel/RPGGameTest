import java.util.Scanner;
import java.util.Random;

class Character {
    private String name;
    private int level;
    private int hp;

    public Character(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    public void CharacterSound() {
        System.out.println("The character makes a sound.");
    }
}

/// //////////////////////////////////////////////////////////
class Enemy{
    private String name;
    private int level;
    private int hp;

    public Enemy(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    public void EnemySound() {
        System.out.println("The enemy makes a sound.");
    }
}

class Goul extends Enemy {
    public Goul(String name, int level, int hp) {
        super(name, level, hp);
    }

    @Override
    public void EnemySound() {
        System.out.println("The Goul says: 1000-7!");
    }
}
/// ////////////////////////////////////////////////////







/// ///////////////////////////////////////////////////

class Warrior extends Character {
    public Warrior(String name, int level, int hp) {
        super(name, level, hp);
    }

    @Override
    public void CharacterSound() {
        System.out.println("The Warrior says: roar!");
    }
}





class Mage extends Character {
    public Mage(String name, int level, int hp) {
        super(name, level, hp);
    }

    @Override
    public void CharacterSound() {
        System.out.println("The Mage says: bow wow");
    }
}





class Cleric extends Character {
    public Cleric(String name, int level, int hp) {
        super(name, level, hp);
    }

    @Override
    public void CharacterSound() {
        System.out.println("The Cleric says: bow wow");
    }
}




public class Main {
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
        player.CharacterSound();
    }
}
