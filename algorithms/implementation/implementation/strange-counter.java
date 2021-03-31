import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the strangeCounter function below.
    static long strangeCounter(long t) {
        
     long curr = 3;
    
    // While time is bigger than current loop
    while (t > curr) {
            // subtract current to time and multiply it by two
            t -= curr;
            curr *= 2;
        }
        
        // return the value of the time
        return curr-t+1;
    
/*         // minTime n-2 to maxTime n-2+n
        // n-2+n can also be written as n*2-2.
        
        while(2*curr-2<=t) {
            curr*=2;
        }
        
        return curr-(t-(curr-2));  */    
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long t = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = strangeCounter(t);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
