package com.epam.learn.main;

import java.util.Scanner;
public class pr9switch {
    public static void main(String[] args) {
           short item = -1;
           Scanner in = new Scanner(System.in);
           System.out.print("***************\n" +
                   "0 - вихід з програми\n" +
                   "1 - площа трикутника\n" +
                   "2 - площа прямокутника\n" +
                   "З - площа круга\n" +
                   "4 - площа трапеції\n");
           System.out.println("Виберіть пункт меню: "); item = in.nextShort();
        switch (item){
                case 0: System.out.println("Вибрано вихід з програми, до зустрічі!"); break;
                case 1: System.out.println("Вибрано площа трикутника"); break;
                case 2: System.out.println("Вибрано площа прямокутника"); break;
                case 3: System.out.println("Вибрано площа круга"); break;
                case 4: System.out.println("Вибрано площа трапеції"); break;
                default: System.out.println("He вибрано жодного пункту меню!");
                }
                in.close();
    }
}
