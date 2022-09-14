package Players.fighters;

import Enemies.Enemy;
import Players.Player;

public abstract class Fighter extends Player {

    public Fighter(String name, int healthPoints) {
        super(name, healthPoints);
    }

    public void attack(IWeapon weapon, Enemy enemy){
        enemy.setHealthPoints(enemy.getHealthPoints() - weapon.getDamageValue());
    }

}
