package Enemies;

public class Troll extends Enemy {

    int counterAttackValue;

    public Troll(String name, int healPoints, int counterAttackValue) {
        super(name, healPoints);
        this.counterAttackValue = counterAttackValue;

    }

    public int getCounterAttackValue() {
        return counterAttackValue;
    }

    public void setCounterAttackValue(int counterAttackValue) {
        this.counterAttackValue = counterAttackValue;
    }
}
