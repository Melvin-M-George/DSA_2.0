package com.MelvinMGeorge;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    }

    static boolean isArmstrong(int n){
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }
        if(sum == n){
            return
        }
    }
}
