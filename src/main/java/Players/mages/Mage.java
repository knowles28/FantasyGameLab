package Players.mages;

import Players.Player;
import Players.healers.IHeal;
import Players.mages.ISpell;

public abstract class Mage extends Player implements ISpell, IHeal {

    public Mage(String name, int healthPoints) {
        super(name, healthPoints);


    }
}
