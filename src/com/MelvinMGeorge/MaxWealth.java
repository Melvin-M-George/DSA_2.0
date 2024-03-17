package com.MelvinMGeorge;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {11,1,1},
                {2,2,2},
                {3,3,3}
        };
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int person = 0; person < accounts.length; person++) {
            int row_sum = 0;

            for (int account = 0; account < accounts[person].length ; account++) {
                row_sum = row_sum + accounts[person][account];
            }
            if(row_sum > max){
                max = row_sum;
            }
        }
        return max;
    }
}
