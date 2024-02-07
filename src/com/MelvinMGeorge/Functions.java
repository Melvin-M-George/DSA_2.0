package com.MelvinMGeorge;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        // Syntax
        /*
          access_modifier return_type name () {
                //body
                return statement;
         */

        //sum();

//        int ans = sum2();
//        System.out.println(ans);

//        String message = greet();
//        System.out.println(message);
        int ans = sum3(5,10);
        System.out.println(ans);
    }

    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2");
        int num2 = sc.nextInt();
        int sum = num1 + num2;

        System.out.println("The sum = "+sum);
    }

    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    static String greet(){
        String greeting = "Hello, how are you?" ;
        return greeting;
    }

    static int sum3(int a, int b){
        return a + b;
    }


}
