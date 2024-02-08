package com.MelvinMGeorge;

public class Swap {
    public static void main(String[] args) {

//        int temp = a;
//        a = b;
//        b = temp;
        int a,b;
        swap(10,20);
        System.out.println(a+ " " + b);
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
