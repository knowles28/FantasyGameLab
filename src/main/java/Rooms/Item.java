package Rooms;

public class Item {

    ItemType itemType;

    public Item(ItemType itemType) {
        this.itemType = itemType;
    }

    public ItemType getType() {
        return itemType;
    }

    public int getValueFromEnum() {
        return this.itemType.getHealthBoostValue();
    }
}
