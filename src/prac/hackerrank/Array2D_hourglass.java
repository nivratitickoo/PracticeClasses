package prac.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 6/8/2018.
 */
public class Array2D_hourglass {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

            int[][] arr = new int[6][6];

            for (int i = 0; i < 6; i++) {
                String[] arrRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 6; j++) {
                    int arrItem = Integer.parseInt(arrRowItems[j]);
                    arr[i][j] = arrItem;
                }
            }

        scanner.close();

        int sum[] = new int[16];
        int h = 0;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                sum[h] = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                        + arr[i+1][j+1]
                        + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                h++;
            }
        }
        Arrays.sort(sum);
        System.out.println(sum[15]);

//        1 1 1 0 0 0
//        0 1 0 0 0 0
//        1 1 1 0 0 0
//        0 0 2 4 4 0
//        0 0 0 2 0 0
//        0 0 1 2 4 0

        //ans - 19


//        int max_sum = 0;
//
//        for(int i = 0; i < 4; i++) {
//            for(int j = 0; j < 4; j++) {
//
//                int temp_sum = 0;
//                // top row
//                temp_sum += arr[i][j];
//                temp_sum += arr[i][j+1];
//                temp_sum += arr[i][j+2];
//                //middle
//                temp_sum += arr[i+1][j+1];
//                //bottom row
//                temp_sum += arr[i+2][j];
//                temp_sum += arr[i+2][j+1];
//                temp_sum += arr[i+2][j+2];
//
//                //if first hourglass, set as max
//                if(temp_sum > max_sum){
//                    max_sum = temp_sum;///this will keep it up to date
//                }
//            }
//        }
//
//        System.out.println(max_sum);
    }
}
