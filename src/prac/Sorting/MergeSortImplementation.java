package prac.Sorting;

/**
 * Created by QXO4360 on 4/24/2018.
 */
public class MergeSortImplementation {

    public static void mergeSort(int[] array,int low, int high){
        int[] helperArray = new int[array.length];
        mergeSort(array,helperArray,0,array.length-1);

    }

    public static void mergeSort(int[] array,int[]helperArray,int low,int high){

        if(low<high){
            int middle = (low+high)/2;

            mergeSort(array,helperArray,0,middle-1);
            mergeSort(array,helperArray,middle+1,0);
            merge(array,helperArray,low,middle,high);
        }
    }

    public static void merge(int[] array, int[] helperArray, int low,int middle,int high) {

        for (int i = 0; i < array.length; i++) {
            helperArray[i] = array[i];
        }
        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        while (helperLeft <= middle && helperRight <= high) {
            if (helperArray[helperLeft] <= helperArray[helperRight]) {
                array[current] = helperArray[helperLeft];
                helperLeft++;
            } else {
                array[current] = helperArray[helperRight];
                helperRight++;
            }
            current++;
        }

        int remaining = middle - helperLeft;
        for(int i=0;i<=remaining;i++){
            array[current+i] = helperArray[helperLeft+i];
        }

        }

        public static void main(String[] args){

        int[] array = new int[]{1,4,5,2,8,9};
        mergeSort(array,0,5);

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" -> ");
        }


        }

    }

