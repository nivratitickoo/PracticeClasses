package prac.hackerrank;

import java.util.Scanner;

/**
 * Created  on 6/5/2018.
 * 4! = 1 X 2 x 3 X 4
 */
public class FactorialWithRecursion {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        scan.close();
        System.out.println("Factorial for "+num+" is "+getFactRec(num));

    }

    public static int getFactRec(int n){

           if(n>1){

               return (n * getFactRec(n-1));
           }
           return 1;
    }
}
