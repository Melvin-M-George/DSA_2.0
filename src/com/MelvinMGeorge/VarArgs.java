package com.MelvinMGeorge;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
       // fun(1,2,3,4,5,6,7,8,9);
        multipleArg(1,4,"Melvin","Shinto");
    }

    static void fun(int ...c){
        System.out.println(Arrays.toString(c));
    }


    static void multipleArg(int a,int b, String ...v){

    }
}
