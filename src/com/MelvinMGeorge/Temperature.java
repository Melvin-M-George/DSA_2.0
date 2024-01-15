package com.MelvinMGeorge;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius");
        float tempC = sc.nextFloat();

        float tempF = (float) (tempC * 1.8) + 32;
        System.out.println(tempF);

    }
}
