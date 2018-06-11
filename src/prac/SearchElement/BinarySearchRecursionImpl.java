package prac.SearchElement;

import prac.Sorting.MergeSortImplementation;
import prac.Sorting.QuickSortImplementation;

/**
 * Created  on 4/24/2018.
 */
public class BinarySearchRecursionImpl {


    public static int binarySearchRecursive(int[] a,int x, int low, int high){

        if(low>high) return -1;

            int mid = (low+high)/2;
            if(a[mid]< x){
                return binarySearchRecursive(a,x,mid+1,high);
            }
            else if(a[mid]>x){
                return binarySearchRecursive(a,x,low,mid-1);
            }
            else {
                return mid;
            }
    }

    public static void main(String[] args){

        QuickSortImplementation qs = new QuickSortImplementation();
        int[] myArray = new int[]{1,4,5,2,8,9};
        qs.quickSort(myArray,0,5);
        for(int i=0;i<myArray.length;i++){
            System.out.print(myArray[i]+" -> ");
        }
        int foundAt = binarySearchRecursive(myArray,2,0,5);
        System.out.println();
        System.out.println(myArray[foundAt]+" was found at location : "+foundAt);

    }
}
