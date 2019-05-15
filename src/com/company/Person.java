package com.company;

import java.security.PublicKey;

public class Person {
    int heals;
    int fight;
    int shot;
    int exp;
    int lvl;
    int patron;

    public Person(int heals, int fight, int shot, int exp, int lvl, int patron) {
        this.heals = heals;
        this.fight = fight;
        this.shot = shot;
        this.exp = exp;
        this.lvl = lvl;
        this.patron = patron;
    }

    public Person(){}
}
