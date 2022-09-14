package Enemies;

import Players.Player;

public abstract class Enemy {
    String name;
    int healthPoints;
    int counterAttackValue;


    public Enemy(String name, int healthPoints, int counterAttackValue ) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.counterAttackValue = counterAttackValue;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healPoints) {
        this.healthPoints = healPoints;
    }

    public void counterAttack(Player player){
        player.setHealthPoints(player.getHealthPoints() - this.counterAttackValue);
    }
}
