class Character {
    private String name;
    private int level;
    private int hp;

    public Character(String name, int level, int hp) {
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


    public void CharacterSound() {
        System.out.println("Character make sound");
    }
}

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
        System.out.println("The Mage says: lol");
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
