package prac.SearchElement;

import prac.Sorting.MergeSortImplementation;

/**
 * Created by QXO4360 on 4/24/2018.
 */
public class BinarySearchImplementation {

    public static int binarySearch(int[] myArray,int x) {

        int low = 0;
        int high = myArray.length - 1;
        int mid = 0;
        while (low <= high) {

            mid = (low + high) / 2;
            if (myArray[mid] < x) {
                low = mid + 1;
            } else if (myArray[mid] > x) {
                high = mid - 1;
            }else {
                return mid;
            }

        }
        return -1;
    }


    //Binary Search always take sorted Array
    public static void main(String[] args){

        MergeSortImplementation ms = new MergeSortImplementation();
        int[] myArray = new int[]{1,4,5,2,8,9};
        ms.mergeSort(myArray,0,5);
        for(int i=0;i<myArray.length;i++){
            System.out.print(myArray[i]+" -> ");
        }
        int foundAt = binarySearch(myArray,2);
        System.out.println();
        System.out.println(myArray[foundAt]+" was found at location : "+foundAt);

    }
}
