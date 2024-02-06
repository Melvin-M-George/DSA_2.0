package com.MelvinMGeorge;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String fruit = sc.next();
//
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "apple" -> System.out.println("sweet red fruit");
//            default -> System.out.println("Enter a fruit");

        int day = sc.nextInt();

//        switch (day){
//            case 1 -> System.out.println("Moday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//
//        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
