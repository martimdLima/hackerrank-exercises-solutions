import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

/*     width = [2, 3, 1, 2, 3, 2, 3, 3]
    cases = [[0, 3], [4, 6], [6, 7], [3, 5], [0, 7]] */
    


    // Complete the serviceLane function below.
    static int[] serviceLane(int n, int[][] cases, int[] width) {
        
        int entryIndex = 0;
        int exitIndex = 0; 
        
        int[] res = new int[cases.length];
        int min = 0;
        for(int i = 0; i < cases.length; i++) {
            //System.out.print(cases[i]);
            
            entryIndex = cases[i][0];
            exitIndex = cases[i][1];
            
            int size = exitIndex - entryIndex;
            
            min = width[entryIndex];
            
            for(int x = entryIndex; x <= exitIndex; x++) {
                
                if(width[x] < min) {
                    min = width[x];
                }
                
            }
            res[i] = min;
        }

        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nt = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nt[0]);

        int t = Integer.parseInt(nt[1]);

        int[] width = new int[n];

        String[] widthItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int widthItem = Integer.parseInt(widthItems[i]);
            width[i] = widthItem;
        }

        int[][] cases = new int[t][2];

        for (int i = 0; i < t; i++) {
            String[] casesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int casesItem = Integer.parseInt(casesRowItems[j]);
                cases[i][j] = casesItem;
            }
        }

        int[] result = serviceLane(n, cases, width);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
