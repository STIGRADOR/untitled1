package com.company;

import java.util.Scanner;
import java.util.logging.Level;

public class Main {

    public static void main(String[] args) {
        Levl lvl = new Levl();

        if (lvl.lvl1() > 0) {
            lvl.endlvl();
        }
        else {
            System.out.println("Game Over");
        }

        // Дальше вызывается уровень 2
    }
}
