package com.epam.learn.main;
import java.util.Scanner;
import java.io.IOException;
public class InputProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число-код для відображення символу: ");
        long s = sc.nextInt();
//        long x;
//        try {
//            x = System.in.read();
           System.out.println("code = " + s + " символ = " + (char)s);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

}
