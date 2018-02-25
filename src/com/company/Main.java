package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        number 1
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println("Hello " + next);
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //        number 2
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println("args = " + args[i]);
        }
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //        number 3
        int[] numbers = {2, 22, 5, 8, 99, 4, 55};
        for (int i : numbers) {
            System.out.println(i);
            System.out.print(i);
        }
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //        number 5

        int sum = 0;
        int pr = 1;
        for (int i = 0; i < args.length; i++) {
            int g = Integer.parseInt(String.valueOf(args[i]));
            sum = sum + g;
            pr = pr * g;
        }
        System.out.println("sum =" + sum);
        System.out.println("pr =" + pr);
    }


}
