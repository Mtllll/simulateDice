package com.company;

/**
 * Created by ttc on 17-12-22.
 */
public class testDice {
    public static void main(String[] args) {
        dice s1 = new dice();
        int arr[]=new int [7];
        s1.init();
        for (int i = 0; i < 1000; i++) {
            arr[s1.throwdice()]++;
        }
        for(int i=1;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}