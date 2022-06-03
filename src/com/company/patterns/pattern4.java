package com.company.patterns;

public class pattern4 {

    public static void main(String[] args) {


        int num = 10;

        for (int i = 1; i <=num ; i++) {
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            //after each row add a new line
            System.out.println();
        }
    }

}