public class Enemy {
    private String name;
    private int level;
    private int hp;

    public Enemy(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    public String getName() {
         return name;
    }
    public int getHp() { 
        return hp; 
    }
    public int getLevel() {
        return level;
    }

    public void EnemySound() {
        System.out.println("Enemy make sound");
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