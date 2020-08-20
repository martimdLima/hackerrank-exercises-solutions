import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    private static int SIZE = 6;

    public static void main(String[] args) {

        int[][] arr = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < SIZE; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        int count = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i <= arr.length - 3; i++) {
            for (int x = 0; x <= arr.length - 3; x++) {
                
                int top = arr[i][x]+arr[i][x+1]+arr[i][x+2];
                int middle = arr[i+1][x+1];
                int bottom = arr[i+2][x]+arr[i+2][x+1]+arr[i+2][x+2];
                sum = top + middle + bottom;
                
                if(sum>count){
                    count=sum;
                }
 
            }
        }
        System.out.println(count);
    }
}