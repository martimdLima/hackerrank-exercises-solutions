import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumps = -1;
        int counter = 0;
        
        for (int i = 0; i < c.length; i++, jumps++) {
            if (i + 2 < c.length && c[i + 2] == 0) {
                i++;
            }

            //jumps++;
        }

        return jumps;
    }
    
    /*      
        int jumps = 0; 
        int i = 0;
        
        //  goes through all clouds up until the last jump
        while(i < n-3)
        {
            i += (c[i+2] == 0) ? 2 : 1;
            jumps++;                
        }
        
        //This is the last jump that will be either a 1 or 2
        jumps++; 
        
    */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
