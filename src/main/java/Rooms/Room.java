package Rooms;

import Enemies.Enemy;
import Players.Player;
import Players.fighters.Fighter;
import Players.mages.Mage;


public class Room {

    private String name;
    private Enemy enemy;
    private ItemType item;

    public Room(String name, Enemy enemy, ItemType item){
        this.name = name;
        this.enemy = enemy;
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public ItemType getItem() {
        return item;
    }

    public void fight(Fighter fighter, Enemy enemy){
        fighter.attack(fighter.getWeapon(), enemy);
        enemy.counterAttack(fighter);
    }

    public void fight(Mage mage, Enemy enemy){
        mage.cast(enemy, mage.getSpell());
        enemy.counterAttack(mage);
        mage.defend(mage.getDefender());
    }

    public void pickUpItem(Player player, ItemType itemType){
        player.setHealthPoints(player.getHealthPoints() + itemType.getHealthBoostValue());
    }
}
