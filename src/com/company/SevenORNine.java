package com.company;

import java.util.Scanner;

public class SevenORNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers of elements:");
        int next = scanner.nextInt();
        int[] numbers = new int[next];
        System.out.println("Enter numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%3==0||numbers[i]%9==0) {
                System.out.println("number "+ numbers[i]);
            }
        }
    }
}

