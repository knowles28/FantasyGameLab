package Players.mages.defence;

public class Forcefield implements IDefend {

    private int defenseHealthBoost;

    public Forcefield(int defenseHealthBoost) {
        this.defenseHealthBoost = defenseHealthBoost;
    }

    public int getDefenceValue(){
        return this.defenseHealthBoost;
    }

}
