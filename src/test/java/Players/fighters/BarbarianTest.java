package Players.fighters;

import Enemies.Troll;
import Players.fighters.weapons.Bow;
import Players.fighters.weapons.Sword;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class BarbarianTest {

    Barbarian barbarian;
    Troll troll;
    Sword sword;
    Bow bow;

    @Before
    public void setUp() throws Exception {
        sword = new Sword(50);
        troll = new Troll("Geoff", 90,5);
        barbarian = new Barbarian("Conan", 100, sword);
        bow = new Bow(60);
    }


    @Test
    public void hasName() {
        assertEquals("Conan", barbarian.getName());
    }


    @Test
    public void canGetHealthPoints() {
        assertEquals(100, barbarian.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints() {
        barbarian.setHealthPoints(50);
        assertEquals(50, barbarian.getHealthPoints());
    }

    @Test
    public void hasWeapon() {
        assertEquals(sword, barbarian.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        barbarian.setWeapon(bow);
        assertEquals(bow, barbarian.getWeapon());
    }
    @Test
    public void canAttackEnemy() {
        barbarian.attack(sword, troll);
        assertEquals(40, troll.getHealthPoints());
//        assertEquals(95, barbarian.getHealthPoints());
    }
}
