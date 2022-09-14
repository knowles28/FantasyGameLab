package Rooms;

public enum ItemType {
    POTION(100),
    HERBS(50);

    private final int healthBoost;

    ItemType(int healthBoost) {
        this.healthBoost = healthBoost;
    }

    public int getHealthBoostValue() {
        return healthBoost;
    }
}
