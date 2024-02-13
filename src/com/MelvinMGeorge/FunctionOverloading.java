package com.MelvinMGeorge;

public class FunctionOverloading {
    public static void main(String[] args) {
//        fun("Melvin");
//        fun(99);
        int ans = sum(1,2);
        System.out.println(ans);

    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
    static int sum(int a, int b){
        return a + b;
    }
    static int sum(int a, int b, int c){
        return a + b + c;
    }
}
