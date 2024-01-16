package com.MelvinMGeorge;

public class Conditionals {
    public static void main(String[] args) {
        /* syntax
            if(boolean expression T or F){
            //body
            } else{

            }

        */
        int salary = 25000;
        if (salary < 10000 ){
            salary = salary + 1000;
        } else if (salary > 20000) {
            salary = salary + 3000;
        } else {
            salary = salary + 2000;
        }

        System.out.println(salary);





    }
}
