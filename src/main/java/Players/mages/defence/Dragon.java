package Players.mages.defence;

public class Dragon implements IDefend {

    private int defenseHealthBoost;

    public Dragon(int defenseHealthBoost) {
        this.defenseHealthBoost = defenseHealthBoost;
    }

    public int getDefenceValue(){
        return this.defenseHealthBoost;
    }

}
