package Players.fighters;

import Enemies.Enemy;
import Players.Player;
import Players.fighters.weapons.IWeapon;

public abstract class Fighter extends Player {

    IWeapon weapon;

    public Fighter(String name, int healthPoints, IWeapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public void attack(IWeapon weapon, Enemy enemy){
        int newHealth = enemy.getHealthPoints() - weapon.getDamageValue();
        if(newHealth < 0){
            enemy.setHealthPoints(0);
        } else{
            enemy.setHealthPoints(newHealth);
//        enemy.counterAttack(fighter);
        }

    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

}
