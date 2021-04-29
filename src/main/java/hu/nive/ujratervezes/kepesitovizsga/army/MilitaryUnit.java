package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    private int hitPoints;
    private int sufferDamage;
    private boolean armor;

    public MilitaryUnit(int hitPoints, int sufferDamage, boolean armor) {
        this.hitPoints = hitPoints;
        this.sufferDamage = sufferDamage;
        this.armor = armor;
    }

    public MilitaryUnit() {

    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getSufferDamage() {
        return sufferDamage;
    }

    public boolean isArmor() {
        return armor;
    }

    public int doDamage() {
        return sufferDamage;
    }

    public abstract void sufferDamage(int damage);

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}





