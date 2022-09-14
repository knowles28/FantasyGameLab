package Rooms;

import Enemies.Orc;
import Enemies.Troll;
import Players.fighters.Barbarian;
import Players.fighters.weapons.Bow;
import Players.fighters.weapons.Sword;
import Players.mages.Wizard;
import Players.mages.defence.Dragon;
import Players.mages.defence.Forcefield;
import Players.mages.magic.Fireball;
import Players.mages.magic.LightningStrike;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {

    Sword sword;
    Troll troll;
    Barbarian barbarian;
    Dragon dragon;
    Fireball fireball;
    Wizard wizard;
    Room room1;

    @Before
    public void setUp(){
        sword = new Sword(50);
        troll = new Troll("Geoff", 90,60);
        barbarian = new Barbarian("Conan", 100, sword);
        dragon = new Dragon(10);
        fireball = new Fireball(25);
        wizard = new Wizard("Gandalf",300, dragon, fireball);
        room1 = new Room("Hell", troll, ItemType.POTION);
    }

    @Test
    public void getName() {
        assertEquals("Hell", room1.getName());
    }

    @Test
    public void getEnemy() {
        assertEquals(troll, room1.getEnemy());
    }

    @Test
    public void getItem() {
        assertEquals(ItemType.POTION, room1.getItem());
    }

    @Test
    public void mageCanFight() {
        room1.fight(wizard, troll);
        assertEquals(65, troll.getHealthPoints());
        assertEquals(250, wizard.getHealthPoints());
    }

    @Test
    public void fighterCanFight() {
        room1.fight(barbarian, troll);
        assertEquals(40, troll.getHealthPoints());
        assertEquals(40, barbarian.getHealthPoints());
    }

    @Test
    public void roomItemAddsHealthPointsToPlayer(){
        room1.fight(barbarian, troll);
        room1.pickUpItem(barbarian, room1.getItem());
        assertEquals(140, barbarian.getHealthPoints());
    }
}