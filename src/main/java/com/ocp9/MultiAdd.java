
package com.ocp9;

public class MultiAdd { 
     public static void add(int... nums) {// ...表示多個參數或是省略號
         
       int sum =0;
       for(int n : nums){
           sum += n;
           
       }
         System.out.println(sum);
         
    }
    public static void main(String[] args) {
        add();
        add(10, 20, 30);
         add(10, 20, 30,40);
          add(10, 20, 30,40,50);
           add(10, 20, 30,40,50,60);
       int[] nums = {10, 20, 30, 40, 50, 60, 70};
        add(nums);
    }
}
