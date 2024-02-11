package com.MelvinMGeorge;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            //int a = 90; already initialized the block, cannot initialize again
            // a = 99; Can change the value
            int c = 99;
            //Values that are initialized in the block, will remain in the block
        }
        //System.out.println(c); c cannot be used outside the block
    }

    static void random(int marks){
        int num = 67;
        System.out.println(num);
    }
}
