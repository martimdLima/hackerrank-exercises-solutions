import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the gameOfThrones function below.
    static String gameOfThrones(String str) {
        
        // number of ASCII characters;
        int NO_OF_CHARS = 256;
        
        // Create a count array and initialize all values as 0
        int count[] = new int[NO_OF_CHARS];
        Arrays.fill(count, 0);

 
        // For each character in input strings,
        // increment count in the corresponding
        // count array
        for (int i = 0; i < str.length(); i++) {
            // increment the position of the ASCII value of the character in the array
            count[(int)(str.charAt(i))]++;
        }

 
        // Count all the odd occurring characters
        int odd = 0;
        System.out.println(0 & 0);
        for (int i = 0; i < NO_OF_CHARS; i++) {
            
            // the condition is only met if count[i] is not divisible by 2
            if ((count[i] % 2 != 0)) {
                odd++;
            }
            
            // if there is more than one odd occuring character there is no palindrome
            if (odd > 1)
                return "NO";
        }
 
        // Return true if odd count is 0 or 1,
        return "YES";
    }
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
