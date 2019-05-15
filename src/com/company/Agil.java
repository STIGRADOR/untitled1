package com.company;

public class Agil {

    Person agil = new Person(100, 1, 2, 0, 1, 5);
    Monsters m1l1 = new Monsters(10, 1, 0, 1);
    int x, xplvl = 0;
    int superfight;

    // Метод ближнего боя
    public int figt() {
        x = m1l1.heals % agil.fight;
        if (x == 0) {
            agil.heals = agil.heals - ((m1l1.heals / agil.fight) * m1l1.fight);
            if (agil.heals > 0) {
                xplvl += m1l1.lvl;
            }
        }
        if (x > 0 && x < 1) {
            agil.heals = agil.heals - (m1l1.fight * (m1l1.heals / agil.fight)) - m1l1.fight;
            if (agil.heals > 0) {
                xplvl++;
            }
        }
        return agil.heals;
    }

    // Метод выстрела
    public int shot() {
        x = (m1l1.heals - agil.shot * 2) % agil.fight;
        if (x == 0) {
            agil.heals = agil.heals - ((m1l1.heals - agil.shot * 2) / m1l1.fight) * m1l1.fight;
            agil.patron -= 2;
            if (agil.heals > 0) {
                xplvl++;
            }
        }
        if (x > 0 && x < 1) {
            agil.heals = agil.heals - ((m1l1.heals - agil.shot * 2) / m1l1.fight) * m1l1.fight - m1l1.fight;
            agil.patron -= 2;
            if (agil.heals > 0) {
                xplvl++;
            }
        }
        return agil.heals;
    }
}
