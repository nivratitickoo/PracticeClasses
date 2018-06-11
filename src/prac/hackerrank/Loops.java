package prac.hackerrank;

import java.util.Scanner;

/**
 * Created by QXO4360 on 5/2/2018.
 */
public class Loops {

    public static void printMultiple( int n, int i){
        System.out.println(n+" x "+i+" = "+n*i);
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1;i<=10;i++){
            printMultiple(n,i);
        }
        scan.close();

    }
}
