package Players.mages;

import Players.mages.defence.IDefend;
import Players.mages.magic.ISpell;

public class Wizard extends Mage {
    public Wizard(String name, int healthPoints, IDefend defender, ISpell spell) {
        super(name, healthPoints, defender, spell);
    }
}
