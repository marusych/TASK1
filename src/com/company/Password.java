package com.company;

public class Password {
    public static void main(String[] args) {
//        number 4
        String pass = "password";
        System.out.println(args[0]);
        if (args[0].equals(pass)){
            System.out.println("Pass is true");
        }else {
            System.out.println("Pass is false");
        }
    }
}
