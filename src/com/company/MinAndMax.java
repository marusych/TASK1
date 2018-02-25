package com.company;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers of elements:");
        int next = scanner.nextInt();
        int [] numbers = new int[next];
        System.out.println("Enter numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scanner.nextInt();
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        int min = numbers[0];
        for (int i = 1; i > numbers.length; i++) {
            if(numbers[i]>min){
                min=numbers[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
