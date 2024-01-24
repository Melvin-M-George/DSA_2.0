package com.MelvinMGeorge;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // for loop
//        for (int i=1;i<=5;i++){
//            System.out.print(i+" ");
//        }

        //print numbers from 1 to n

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            System.out.print(i+" ");
        }
    }
}
