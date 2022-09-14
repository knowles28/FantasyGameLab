package Players.fighters.weapons;

public class Bow implements IWeapon{

    private int damageValue;

    public Bow(int damageValue) {
        this.damageValue = damageValue;
    }

    public int getDamageValue() {
        return this.damageValue;
    }
}
