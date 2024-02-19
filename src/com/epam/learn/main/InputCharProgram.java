package com.epam.learn.main;
import java.util.Scanner;

public class InputCharProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть символ: ");
        char input = scan.next().charAt(0);
        System.out.println(input);
    }
}
