package prac.Sorting;

/**
 * Created QXO4360 on 4/24/2018.
 */
public class QuickSortImplementation {

    public static void quickSort(int[] arr, int low, int high){

        if(low<high){
          int pi = partition(arr,low,high);
            quickSort(arr, low, pi-1);
            quickSort(arr,pi+1,high);
        }
    }

    //check code if pivot is lowest or in middle somewhere ----------
    public static int partition(int[] arr, int low, int high){

        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<=high-1;j++){
            //Swap arr[i] & arr[j]
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //Swap arr[i+1] and arr[high]
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }


    public static void main(String[] args){

        int[] array = new int[]{1,4,5,2,8,9};
        quickSort(array,0,5);

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" -> ");
        }
    }
}
