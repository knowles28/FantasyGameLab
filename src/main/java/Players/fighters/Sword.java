package Players.fighters;

public class Sword implements IWeapon {

    private int damageValue;

    public Sword(int damageValue) {
        this.damageValue = damageValue;
    }

    public int getDamageValue() {
        return this.damageValue;
    }

}
