package com.epam.learn.main;

import java.util.List;

public class DataTypes {
    public static void main(String[] y) {
        int int_variable = 10;
        float float_variable = 10.50f;
        char character_variable = 78;
        char character_variable_char = 'a';
        boolean boolean_variable = false;
        System.out.println("The int value is " + int_variable);
        System.out.println("The float value is " + float_variable);
        System.out.println("The char value is " + character_variable);
        System.out.println("The char value is " + character_variable_char);
        System.out.println("The char value is " + boolean_variable + "\n");

        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println("Process ID: " + currentProcess.pid());
        System.out.println("Is alive? " + currentProcess.isAlive() + "\n");

        List<String> colors = List.of("Red", "Green", "Blue", "White", "Yellow");
        System.out.println(colors);
    }
}
