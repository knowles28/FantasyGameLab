package Players.mages.magic;

public class LightningStrike implements ISpell {

    private int lightningStrikeValue;

    public LightningStrike(int lightningStrikeValue) {
        this.lightningStrikeValue = lightningStrikeValue;
    }

    public int getSpellValue() {
        return this.lightningStrikeValue;
    }

}
