package com.company;

import java.util.Scanner;

public class EvenAndOdd {
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
            if (numbers[i] == 0) {
                System.out.println("number equal 0");
            }else if (numbers[i] % 2 == 0) {
                    System.out.println("even = " + numbers[i]);
                } else {
                    System.out.println("odd = " + numbers[i]);
                }
            }
        }
    }
