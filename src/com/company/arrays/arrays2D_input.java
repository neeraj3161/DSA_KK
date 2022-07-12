package com.company.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrays2D_input {
    //explanation there in DSA ipad
    public static void main(String[] args) {
        int arr[] [] = new int[3][2];
        System.out.println("Length of the arrays is "+arr.length);

        //defining the input

        Scanner sc = new Scanner(System.in);

        for(int row = 0; row<arr.length;row++){
            for(int col =0; col<arr[0].length;col++){
                //taking input of the values
                arr[row][col] = sc.nextInt();
            }

        }

        //printing the array

        for (int i = 0; i <arr.length ; i++) {

            System.out.println("Arrays at "+i+" position is "+ Arrays.toString(arr[i]));

        }


    }
}
