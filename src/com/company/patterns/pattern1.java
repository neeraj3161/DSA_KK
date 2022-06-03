package com.company.patterns;

public class pattern1 {

    public static void main(String[] args) {

        int num =5;

        //outer loop will run the number of rows times
        for (int i = 0; i <=num ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            //when one row is printed we need to add a new line
            System.out.println();
        }
    }

}