package com.company.patterns;

public class pattern3 {

    public static void main(String[] args) {


        int num=10;
        for (int i = 1; i <=num ; i++) {
            for (int j =num; j >=i ; j--) {
                System.out.print("*");

            }

            System.out.println();
        }
    }

}