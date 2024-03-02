package com.MelvinMGeorge;

public class linearSearch {
    public static void main(String[] args) {
        int[] nums = {33, 67, 89, 154, 178, 192, 278, 567};
        int target = 278;
        int ans = linear_Search(nums, target);
        System.out.println(ans);
    }
    // search in the array: if item found , return the index
    // if the item is not found, return -1

    static int linear_Search(int[] arr, int target){
        if(arr.length == 0) return -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
