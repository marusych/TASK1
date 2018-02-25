package com.company;

import java.util.Scanner;

public class HappyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers of elements:");
        int next = scanner.nextInt();
        int[] numbers = new int[next];
        System.out.println("Enter numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int a, b,c,d;
        for (int numbersV : numbers) {
            String num = String.valueOf(numbersV);
            a = num.charAt(0);
            b = num.charAt(1);
            c = num.charAt(2);
            d = num.charAt(3);
            if ((num.length()==4)){
                a = num.charAt(0);
                b = num.charAt(1);
                c = num.charAt(2);
                d = num.charAt(3);
            }else{
                System.out.println("Wrong number of correct value");
            }
                 if (a+b==c+d){
                System.out.println("number "+ numbersV);
            }
        }
    }
}
