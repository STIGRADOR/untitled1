package com.company;

import java.util.Scanner;

public class Levl extends Agil {
    int i;

    public int lvl1() {
        System.out.println("\n             Впереди монстр 1 уровня. Ринутmcя в ближний бой или начать с выстрела?");
        System.out.println("\n1 - Ближний бой с ножом.");
        System.out.println("2 - Сначала произвести 2 выстрела, а потом вступить в рукопашный бой.\n");
        Scanner a = new Scanner(System.in);
        i = a.nextInt();

        if (i == 1) {
            figt();
        }

        if (i == 2 && agil.patron > 0) {
            shot();
        }

        if (i == 2 && agil.patron == 0) {
            System.out.println("У вас нет патронов. Остаётся только идти в ближинй бой");
            figt();
        }
        return agil.heals;
    }

    public void lvl2 () {

    }

    // Итоги по окнчанию уровня
    public void endlvl (){
            System.out.println("             *****Поздравляем! Вы прошли урвоень!*****");
            System.out.println("У вас:");
            System.out.println("Здоровья: "+agil.heals);
            System.out.println("Патронов: "+agil.patron);
            System.out.println("Опыт плучено: "+xplvl);
            System.out.println("Уровень: "+agil.lvl);
    }
}