package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {

    private int hitPoints = 150;
    private int sufferDamage = 20;
    private boolean armor = true;



    @Override
    public int sufferDamage(int damage) {
        return sufferDamage / 2;
    }

    @Override
    public int doDamage() {
        return sufferDamage;
    }

    @Override
    public int getHitPoints() {
        return hitPoints;
    }

    @Override
    public int getSufferDamage() {
        return sufferDamage;
    }

    @Override
    public boolean isArmor() {
        return armor;
    }
}
