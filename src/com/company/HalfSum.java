package com.company;

import java.util.Scanner;

public class HalfSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers of elements:");
        int next = scanner.nextInt();
        int[] numbers = new int[next];
        System.out.println("Enter numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 1; i < numbers.length-1; i++) {
            if(numbers[i]==numbers[i-1]+numbers[i+1]/2){
                System.out.println(numbers[i]);
            }
        }
    }
}
