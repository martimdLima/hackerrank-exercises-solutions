import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        
        int min = scores[0]; // 3 , 3
        int max = scores[0]; // 3, 4
        int minScore = 0;
        int maxScore = 0;
        int iniScore = 0;
        //int maxScore = 0;
        int[] results = new int[2];
        
        for(int i = 1; i < scores.length; i++) {
            
            if(scores[i] < min) {
                min = scores[i];
                minScore++;
                //scores[1] = minScore;
            }
            
            if(scores[i] > max) {
                max = scores[i];
                maxScore++;
                //scores[0] = maxScore;
            }  
            
        }
        System.out.println(min + ": " + max);
        results[1] = minScore;
        results[0] = maxScore;
        return results;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
