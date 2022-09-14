package Players.fighters;

import Players.fighters.weapons.IWeapon;

public class Dwarf extends Fighter{

    IWeapon weapon;

    public Dwarf(String name, int healthPoints) {
        super(name, healthPoints);
    }
}
