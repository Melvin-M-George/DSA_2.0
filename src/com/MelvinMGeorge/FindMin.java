package com.MelvinMGeorge;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {100,2000,300,4,5,6,7,8,9};
        int ans = Minimum(arr);
        System.out.println(ans);
    }

    static int Minimum(int[] arr){
        int min = Integer.MAX_VALUE;
        for( int element: arr){
            if(element < min){
                min = element;
            }
        }
        return min;
    }
}
