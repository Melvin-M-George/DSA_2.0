package com.MelvinMGeorge;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int index1 = 1;
        int index2 = 6;
        int target = 5;
        boolean ans = searchInRange(arr, index1, index2, target);
        System.out.println(ans);
    }

    static boolean searchInRange(int[] arr, int index1, int index2, int target){
        for (int i = index1; i < index2; i++) {
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
