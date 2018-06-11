package prac.hackerrank;

import java.io.*;
import java.util.*;


//Condiional Statements

//Given an integer,n, perform the following conditional actions:
//
//        If n is odd, print Weird
//        If n is even and in the inclusive range of 2 to 5 , print Not Weird
//        If n is even and in the inclusive range of 6 to 20, print Weird
//        If n is even and greater than 20, print Not Weird
/**
 * Created by QXO4360 on 5/1/2018.
 */
public class ConditionalStat {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n%2==1 || (n>5 && n<21)){
            ans = "Weird";
        }
        else{
            if (n >= 2 || n < 5 || n>20) {
                ans = "Not Weird";
            }

        }
        System.out.println(ans);
    }

}
