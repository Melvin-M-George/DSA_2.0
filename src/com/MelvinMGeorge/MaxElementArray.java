package com.MelvinMGeorge;

public class MaxElementArray {
    public static void main(String[] args) {
        int[] arr = {1,2,333,4,5,6666,7,8,99999};
        //System.out.println(maxElement(arr));
        System.out.println(maxInrange(arr,2,6));
    }

    static int maxElement(int[] arr){
         int max = Integer.MIN_VALUE;
         for(int element : arr){
             if(element > max){
                 max = element;
             }
         }
         return max;
    }

    static int maxInrange(int[] arr, int index1, int index2){
        int max = Integer.MIN_VALUE;
        for (int i = index1; i < index2; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
