import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
        
        
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();

        int tCounter = 1;
        
        for(int i = 0; i <= arr.length-1; i++) {
            
            if(!count.containsKey(arr[i])) {
                count.put(arr[i], 1);

            } else {

                int counter = count.get(arr[i]) + 1;
                
                count.put(arr[i], counter);
                tCounter = (counter > tCounter) ? counter : tCounter;
            }
        }
        
        return arr.length - tCounter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = equalizeArray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
