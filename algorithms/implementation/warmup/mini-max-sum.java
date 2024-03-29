import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
static void miniMaxSum(int[] arr) {
        
    // Initialize the minElement, maxElement
       
    long min = arr[0];
    long max = 0; 
    long sum = 0;
        
    Arrays.sort(arr);
 
    // Traverse the entire array
    for (int i = 0; i <= arr.length-1; i++) {
 
        // calculate the sum of
        // array elements
        sum += arr[i];
 
        // Keep updating the
        // minimum element
        if (arr[i] <= min) {
            min = arr[i];
        }
 
        // Keep updating the
        // maximum element
        if (arr[i] >= max) {
            max = arr[i];
        }
    }
 
        // print the minimum and maximum sum
        System.out.println((sum - max) + " "
                        + (sum - min));
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
