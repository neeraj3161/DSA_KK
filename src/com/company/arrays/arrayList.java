package com.company.arrays;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        //if you dont know what size you need for an array you can use array list...it is similar to vectors in c++
        //arrays list is a class which starts with capital letter

        ArrayList<Integer>arr = new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            arr.add(i);
        }
        System.out.println(arr);
    }
}
