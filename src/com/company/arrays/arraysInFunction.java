package com.company.arrays;


import java.util.Arrays;

//arrays are mutable object whereas strings are not
public class arraysInFunction {

    public static void main(String[] args) {
        int [ ] num = {3,6,8,9,7};
        System.out.println(Arrays.toString(num));
        changeArray(num);
        System.out.println(Arrays.toString(num));
    }


    public static void changeArray(int arr[]){
        arr[0]=99;
    }



}
