package com.MelvinMGeorge;

import java.util.Scanner;

public class Nested_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.next();

        switch (empID){
            case 1:
                System.out.println("Melvin");
                break;
            case 2:
                System.out.println("Manav");
                break;
            case 3:
                switch (department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("management department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Enter correct empID");
        }
    }
}
