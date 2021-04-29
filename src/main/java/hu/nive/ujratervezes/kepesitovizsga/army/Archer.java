package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit {

    private int hitPoints = 50;
    private int sufferDamage = 20;
    private boolean armor = false;



    @Override
    public int doDamage() {
        return sufferDamage;
    }

    @Override
    public void sufferDamage(int damage) {

    }


}
