package com.MelvinMGeorge;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = (int) 98.77f;
        System.out.println(num);

        int a = 257;
        byte b = (byte) a;
        System.out.println(b) ;  //257 % 256 = 1

    }
}
