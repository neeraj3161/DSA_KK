package com.company.BinarySearch;

public class SortedArray {
    public static void main(String[] args) {
       int[]sortedArray = {1,5,6,9,8,14,16,18,22};
       //find the middle element and check if this is less than the element to be searched if yes search towards right else left
        int mid = (sortedArray.length-1)/2;
        int start =0;
        int end = sortedArray.length-1;

        int elementToBeSearched = 16;

        boolean elementFound = false;

        while(!elementFound)
        {
            if(sortedArray[mid]==elementToBeSearched)
            {
                elementFound=true;
                System.out.println(mid);
            }
            else if (sortedArray[mid]<elementToBeSearched)
            {
                start = mid++;
            }
        }


    }
}
