package com.company.arrays;

import java.util.Arrays;

public class swapTheArrayProblem {
    public static void main(String[] args) {
        swappingTheNumbers(2,5);

        int[] arr = {1,2,5,6,8,9,7,18};
        swppingArray(arr,2,5);
        System.out.println(Arrays.toString(arr));

    }

    private static void swppingArray(int arr[],int index1,int index2) {
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }


    public static void  swappingTheNumbers(int num1,int num2){
        int a = num1;
        int b=num2;
        int temp = a;
        a=b;
        b=temp;
        System.out.println("Original numbers a: "+num1+"\nb: "+num2);
        System.out.println("Swapped numbers a: "+a+"\nb: "+b);
    }
}
