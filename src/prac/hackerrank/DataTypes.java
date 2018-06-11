package prac.hackerrank;

import java.util.Scanner;

//Data Types
public class DataTypes {

    public static void main(String[] args){

        int i = 4;
        double d = 4.0;
        String s = "HackerRank";

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        double db = scan.nextDouble();
        scan.nextLine();
        String str =scan.nextLine();

        System.out.println(i + num);
        System.out.printf("%.1f",d + db);
        System.out.println();
        System.out.println(s+str);

        scan.close();

    }

}

