package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {
    private int hitPoints = 100;
    private int sufferDamage = 10;
    private boolean armor;

    @Override
    public void sufferDamage(int damage) {

    }

    public Swordsman(int hitPoints, int sufferDamage, boolean armor, int hitPoints1, int sufferDamage1, boolean armor1) {
        super(hitPoints, sufferDamage, armor);
        this.hitPoints = hitPoints1;
        this.sufferDamage = sufferDamage1;
        this.armor = armor1;
    }

    @Override
    public int getHitPoints() {
        return hitPoints;
    }
}
