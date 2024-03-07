package com.MelvinMGeorge;

public class EvenDigits {
    public static void main(String[] args) {
        // find number of elements that has even-number of digits
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int element : nums){
            if(even(element)) count++;
        }
        return count;
    }



    //function to check whether a number contains even-number of digits or not
    static boolean even(int num){
       int numberOfDigits = digits(num);
       if(numberOfDigits % 2 == 0){
           return  true;
       }
       return false;
    }

    static int digits(int num){
        int count = 0;
        while (num > 0){
            num = num / 10;
            count++;
        }
        return count;
    }
}
