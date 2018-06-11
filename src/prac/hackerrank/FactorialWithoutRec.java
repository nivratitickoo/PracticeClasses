package prac.hackerrank;

import java.util.*;

/**
 * Created  on 5/16/2018.
 * 4! = 1 X 2 x 3 X 4
 */
public class FactorialWithoutRec {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        scan.close();
        System.out.println("Factorial for "+num+" is "+getFact(num));

    }

    public static int getFact(int n){

        int factValue = 1;

        for(int i=1;i<=n;i++){
            factValue = factValue * i;
        }

        return factValue;

    }
}
