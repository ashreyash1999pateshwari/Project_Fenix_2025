package com.javaLearning;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte val1 = 126;
        short val2 = 9999;
        int val3 = 79237429;
        long res = 50000L + 10L * (val1+val2+val3);
        System.out.println(res);

        String str = "Hello World";
        System.out.println(str);

        double noOfHours = 135.5;
        double noOfHoursPut = 8;
        double noOfDays = noOfHours/noOfHoursPut;
        System.out.println(noOfDays);

        System.out.println("Type a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        switch (number){
            case 1 : System.out.println("the number is one");
            case 5 :
                System.out.println("the number is five");
        }

    }
}