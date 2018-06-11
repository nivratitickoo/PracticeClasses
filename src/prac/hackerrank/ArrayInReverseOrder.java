package prac.hackerrank;

import java.util.*;


/**
 * Created  on 5/15/2018.
 */
public class ArrayInReverseOrder {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = scan.nextInt();
        }
        scan.close();
        for(int i = n-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}
