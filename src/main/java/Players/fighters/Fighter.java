package Players.fighters;

import Enemies.Enemy;
import Players.Player;
import Players.fighters.weapons.IWeapon;

public abstract class Fighter extends Player {

    public Fighter(String name, int healthPoints) {
        super(name, healthPoints);
    }

    public void attack(IWeapon weapon, Enemy enemy){
        enemy.setHealthPoints(enemy.getHealthPoints() - weapon.getDamageValue());
//        enemy.counterAttack(fighter);

    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

}
