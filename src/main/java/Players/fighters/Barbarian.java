package Players.fighters;

import Players.fighters.weapons.IWeapon;

public class Barbarian extends Fighter {

    IWeapon weapon;


    public Barbarian(String name, int healthPoints, IWeapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

//    ADD UNIQUE PROPERTIES TO FIGHTER SUBCLASSES


}
