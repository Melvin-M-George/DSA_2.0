package com.MelvinMGeorge;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(55);
//        list.add(555);
//        list.add(55555);
//        System.out.println(list);
//        System.out.println(list.contains(55));
//        list.set(0, 99);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);
//        System.out.println(list.get(1));

        //input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
}
