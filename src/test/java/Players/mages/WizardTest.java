package Players.mages;

import Enemies.Orc;
import Players.mages.defence.Dragon;
import Players.mages.defence.Forcefield;
import Players.mages.magic.Fireball;
import Players.mages.magic.LightningStrike;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WizardTest {

    Dragon dragon;
    Forcefield forcefield;

    Fireball fireball;
    LightningStrike lightening;

    Orc orc;
    Wizard wizard;

    @Before
    public void setUp() throws Exception {
        orc = new Orc("Bobby", 40, 15);
        dragon = new Dragon(10);
        fireball = new Fireball(25);
        wizard = new Wizard("Gandalf",300, dragon, fireball);
        lightening = new LightningStrike(50);
        forcefield = new Forcefield(20);
    }


    @Test
    public void canGetName() {
        assertEquals("Gandalf", wizard.getName());
    }

    @Test
    public void canGetHealthPoints() {
        assertEquals(300, wizard.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints() {
        wizard.setHealthPoints(250);
        assertEquals(250, wizard.getHealthPoints());
    }

    @Test
    public void canGetDefender() {
        assertEquals(dragon, wizard.getDefender());
    }

    @Test
    public void canChangeDefender() {
        wizard.changeDefender(forcefield);
        assertEquals(forcefield, wizard.getDefender());
    }

    @Test
    public void canGetSpell() {
        assertEquals(fireball, wizard.getSpell());
    }

    @Test
    public void canChangeSpell() {
        wizard.setSpell(lightening);
        assertEquals(lightening, wizard.getSpell());

    }

    @Test
    public void canDefend() {
        wizard.defend(forcefield);
        assertEquals(320, wizard.getHealthPoints());

    }

    @Test
    public void canCast() {
        wizard.cast(orc, lightening);
        assertEquals(0,orc.getHealthPoints());
    }
}