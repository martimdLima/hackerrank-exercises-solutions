import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
    
    Character mountain = new Character('U');
    Character valley = new Character('D');
    int seaLevel = 0;
    int valleys = 0;
    
    for(int i = 0; i < path.length(); i++) {
        
        // the current step
        char curr = path.charAt(i);
            
            // if the current step equals a set upward increment seaLevel
            if (mountain.equals(curr)) {
            seaLevel++;
            }
            
            // if the current step equals a set downward increment seaLevel
            if (valley.equals(curr)) {
                seaLevel--;
                // if the seaLevel equals -1, we are in a valley, so increment the counter
                if(seaLevel== -1) {
                    valleys++;
                }            
        }
    }
        
        return valleys;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
