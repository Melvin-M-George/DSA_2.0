package com.MelvinMGeorge;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            1 2 3
            4 5 6
            7 8 9
         */

        int[][] arr = new int[3][3];

//        int[][] arr = {
//                {1,2,3}, // 0th index
//                {4,5}, // 1st index
//                {6,7,8,9} //2nd index
//        };
        //input
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = sc.nextInt();
            }
        }
        //output
//        for (int row = 0; row < arr.length; row++) {
//            for (int column = 0; column < arr[row].length; column++) {
//                System.out.print(arr[row][column] + " ");
//            }
//            System.out.println();
//        }
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        for(int[] element: arr){
            System.out.println(Arrays.toString(element));
        }



    }
}
