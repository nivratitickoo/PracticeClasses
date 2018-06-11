package prac.hackerrank;

import java.util.Scanner;

/**
 * Created QXO4360 on 6/6/2018.
 */
public class IntegertoBinaryNum {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

            int rem =0;
            String bin = "";
            int i = 1;
            int max = 0;

            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();

        while(n>0) {
            rem = n % 2;
            bin = rem + bin;
            n = n / 2;
        }

        String[] ones = bin.split("0");

     //String[] ones = Integer.toBinaryString(n).split("0");
            for (String s : ones) {
                if (s.length() > max)
                    max = s.length();
            }
            System.out.println(max);
        }



    }

