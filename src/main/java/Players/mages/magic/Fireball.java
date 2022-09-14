package Players.mages.magic;

public class Fireball implements ISpell {


    private int spellValue;

    public Fireball(int spellValue) {
        this.spellValue = spellValue;
    }

    public int getSpellValue() {
        return this.spellValue;
    }
}
