package com.javaLearning;

public class LoopsAndFunctions {


    public static void loops(){
        int num=5;

        for(int i = 0; i<num; i++){
            System.out.println("current number is "+ i);
        }

        int mynum = 5;
        while (mynum >0){
            System.out.println("this is while loop and current number is "+mynum);
            mynum--;
        }
    }
    public static void printPrimeNumbers(){
        int num = 10;
        for (int i = 2; i <= num; i++){
            boolean isPrime = true;

            for(int j = 2 ; j<= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.printf(i+" ");
            }
        }
    }

    public static void sumOfNNums(){
        int num = 10;
        int sum = 0;
        for(int i = 0; i <= num; i++){
            sum += i;
        }
        System.out.println();
        System.out.println("Sum of "+num+" numbers is "+sum);
    }

    public static void tableForN(){
        int num = 7;
        System.out.println("Table for "+num+" is ");
        for (int i = 1 ; i <= 10 ; i++){
            System.out.printf(num*i+" ");
        }
    }

    public static void isPalindrome(int num){
        System.out.println();
        int originalNum = num;
        int sum = 0;
        while(num > 0){
            int lastDigit = num % 10;
            sum = sum * 10 + lastDigit;
            num /= 10;
        }
        if(sum == originalNum){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    public static void reverseANumber(int num){
        System.out.println();
        int sum = 0;
        while(num > 0){
            int lastDigit = num % 10;
            sum = sum * 10 + lastDigit;
            num /= 10;
        }
        System.out.println(sum);
    }
    public static void factorialOfN(int num){
        System.out.println();
        int sum = num;
        while(num > 0){
            num--;
            if(num != 0){
                sum = sum * num;
            }
        }
        System.out.println(sum);
    }

    public static void rightAngleTrianglePattern(){
        int count = 0;
        for(int i = 1; i< 5 ; i++){
            for(int j = 1; j<=i ; j++){
                count++;
                System.out.printf(count + " ");  //floyed algorithm
//                System.out.printf(j+" ");
//                System.out.printf("*");
            }
            System.out.println();
        }
    }

}
