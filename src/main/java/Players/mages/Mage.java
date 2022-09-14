package Players.mages;
import Enemies.Enemy;
import Players.Player;
import Players.mages.defence.IDefend;
import Players.mages.magic.ISpell;

public abstract class Mage extends Player implements ISpell, IDefend {

    IDefend defender;
    ISpell spell;

    public Mage(String name, int healthPoints, IDefend defender, ISpell spell) {
        super(name, healthPoints);
        this.defender = defender;
        this.spell = spell;
    }

    public IDefend getDefender() {
        return defender;
    }

    public void changeDefender(IDefend defender) {
        this.defender = defender;
    }
    public int getDefenceValue() {
        return defender.getDefenceValue();
    }


    public ISpell getSpell() {
        return spell;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }

    public int getSpellValue() {
        return spell.getSpellValue();
    }


    public void defend(IDefend defender){
        this.setHealthPoints(this.getHealthPoints() + defender.getDefenceValue());
    };

    public void cast(Enemy enemy, ISpell spell){
        int newHealth = enemy.getHealthPoints() - spell.getSpellValue();
        if(newHealth<0){
            enemy.setHealthPoints(0);
        }else{
            enemy.setHealthPoints(newHealth);
        }
    }


}
