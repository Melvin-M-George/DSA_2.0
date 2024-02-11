package com.MelvinMGeorge;

public class Shadowing {
    static  int x = 90;
    public static void main(String[] args) {
        System.out.println(x);
        int x ;
        //System.out.println(x); scope begins when a variable is initialized
        x = 100;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
