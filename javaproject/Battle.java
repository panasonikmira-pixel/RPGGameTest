class Battle {
    private Character player;
    private Goul goul;

    public Battle(Character player, Goul goul) {
        this.player = player;
        this.goul = goul;
    }

    public void startFight() {
        System.out.println(" Battle start " + player.getName() + " and GOul " + goul.getName());

        int playerHp = player.getHp();
        int goulHp = goul.getHp();

        while (playerHp > 0 && goulHp > 0) {
            int playerDamage = (int)(Math.random() * player.getLevel() * 2);
            int goulDamage = (int)(Math.random() * goul.getLevel() * 2);

            goulHp -= playerDamage;
            playerHp -= goulDamage;

            System.out.println(player.getName() + " HIT " + playerDamage + " dmg");
            System.out.println(goul.getName() + " HIT " + goulDamage + " dmg");

            System.out.println("HP " + player.getName() + " : " + Math.max(playerHp, 0));
            System.out.println("HP " + goul.getName() + " : " + Math.max(goulHp, 0));
            System.out.println("-----------------------------");
        }

        if (playerHp > 0) {
            System.out.println("You win " + player.getName());
        } else {
            System.out.println("You lose");
        }
    }
}
