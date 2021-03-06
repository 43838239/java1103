package com.ocp4;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] nums = getRandomNumber(4);
        System.out.println(Arrays.toString(nums));
    }
    //取得指定數量 (amount)的隨機數
    public static int [] getRandomNumber(int amount) {
        Random r = new Random();
        int[] nums = new int[amount];
        for(int i=0;i<nums.length;) {
            int n = r.nextInt(9) + 1;//隨機數值(1-9)
            if(!isExist(nums, n)) {//n擲是否在於nums陣列中?
                
                nums[i] = n;
                i++;
            }
        }
        return nums;
    }
    
    public static boolean isExist(int[] nums, int n) {
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == n) {
                return true;
            }
        }
        return false;
    }
}