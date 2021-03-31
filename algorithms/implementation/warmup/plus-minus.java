import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        
                double pos = 0;
        double neg = 0;
        double zer = 0;
        
        if(arr.length > 0 || arr.length <= 100 ) {
        
        for(int num : arr) {
            
            if(num >= -100 || num <= 100) {
            if(num > 0) {
                pos++;
            }
            
              if(num < 0) {
                neg++;
            }
            
              if(num == 0) {
                zer++;
            }
            }
        }
        }
        
        DecimalFormat df = new DecimalFormat("#.######");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
