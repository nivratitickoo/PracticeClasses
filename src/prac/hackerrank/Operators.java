package prac.hackerrank;

import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


//On operators
/**
 * Created by QXO4360 on 5/1/2018.
 */
public class Operators {

    //Better way to do :
    public static double totalTip(double meal_cost,int tip_percent){
        return (meal_cost*tip_percent)/100;
    }
    public static double totalTax(double meal_cost,int tax_percent){
        return (meal_cost*tax_percent)/100;
    }

    public static double totalCost(double meal_cost,int tip_percent,int tax_percent){
        return meal_cost + totalTip(meal_cost,tip_percent) + totalTax(meal_cost,tax_percent);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();


        //wrong approach
        double val1 = 4/20; //this will give 0 cz it considers int/int and division value for this is int that is 0
        System.out.printf("%.2f",val1);
        System.out.println();

        //this will give the right valUE
        double val2 = 4.0/20.0; // this is double /double

        System.out.printf("%.2f",val2);
        System.out.println();
        System.out.println("testing double division " + val2);

        int totalCost = (int)(meal_cost + (meal_cost*tip_percent)/100 + (meal_cost*tax_percent)/100 ) ;//failed 1 test case on hanker rank cz int is  truncating value
        System.out.println("The total meal cost is " + totalCost +" dollars");
        //Passed :

        System.out.println("The total meal cost is " + Math.round(totalCost) +" dollars");


        //OR
       //better way :

      //  int total_Cost = (int)(meal_cost + totalTip(meal_cost,tip_percent) + totalTax(meal_cost,tax_percent)) ;//failed one test case, cz it needs to be rounded up not trunccated by making it int


        System.out.println("The total meal cost is " + Math.round(totalCost(meal_cost,tip_percent,tax_percent)) +" dollars");

        in.close();
    }

}
