package com.MelvinMGeorge;

import java.util.Arrays;
import java.util.Scanner;

public class arrays_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        // input using for loops
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        for(int element: arr){
//            System.out.println(element);
//        }
//        System.out.println(Arrays.toString(arr));

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));
    }
}
