package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    List<MilitaryUnit> militaryUnits = new ArrayList<>();

    public Army(List<MilitaryUnit> militaryUnits) {
        this.militaryUnits = militaryUnits;
    }

    public List<MilitaryUnit> getMilitaryUnits() {
        return militaryUnits;
    }

    public void addUnit(MilitaryUnit militaryUnit) {
        militaryUnits.add(militaryUnit);
    }

    public void damageAll(int damage) {
        List<MilitaryUnit> toRemove = new ArrayList<>();


        for (MilitaryUnit militaryUnit : militaryUnits) {


            militaryUnit.setHitPoints(militaryUnit.getHitPoints() - damage);

            if (militaryUnit.getHitPoints() < 25) {
                toRemove.add(militaryUnit);
            }
        }
        militaryUnits.removeAll(toRemove);

    }

    public int getArmyDamage() {
        int damageSum = 0;
        for (MilitaryUnit militaryUnit : militaryUnits) {
            damageSum += militaryUnit.getSufferDamage();
        }
        return damageSum;
    }

    public int getArmySize() {
        return militaryUnits.size();
    }




}
