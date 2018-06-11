package prac.hackerrank;

import java.util.*;
import java.io.*;

/**
 * Created by QXO4360 on 5/8/2018.
 */
public class StringOddEvenIndicies {

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        ArrayList<String> arrLs = new ArrayList<String>();

        for(int i = 1;i<=t; i++){
            String str = scan.nextLine();
            String evenStr = "";
            String oddStr = "";
            for(int j=0;j<str.length();j++){
                if(j%2 == 0){
                    evenStr = evenStr+str.charAt(j);
                }
                else{
                    oddStr = oddStr+str.charAt(j);
                }
            }
            arrLs.add(evenStr+" "+oddStr);

        }
        scan.close();

        for(String val : arrLs){
            System.out.println(val);
        }

    }

}
