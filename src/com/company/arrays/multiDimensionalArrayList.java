package com.company.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class multiDimensionalArrayList {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initializing each array
        for (int i = 0; i < 3 ; i++) {
            list.add(new ArrayList<>());
            //adding element
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }


        System.out.println(list);


    }
}
