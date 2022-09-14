package Players.mages;

import Players.mages.defence.IDefend;
import Players.mages.magic.ISpell;

public class Witch extends Mage {

    public Witch(String name, int healthPoints, IDefend defender, ISpell spell) {
        super(name, healthPoints, defender, spell);
    }
}
