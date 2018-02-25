package com.company;
import java.util.Scanner;

public class ThreeDifferentNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers of elements:");
        int next = scanner.nextInt();
        int[] numbers = new int[next];
        System.out.println("Enter numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int numbersV : numbers) {
            String num = String.valueOf(numbersV);
            if ((num.length()==3)&&(num.charAt(0)!=num.charAt(1))
                    &&(num.charAt(1)!=num.charAt(2))
                    &&(num.charAt(0)!=num.charAt(2))) {
                System.out.println("number "+ numbersV);
            }
        }
    }
}
