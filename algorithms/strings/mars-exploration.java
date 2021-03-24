import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the marsExploration function below.
    static int marsExploration(String s) {
        int counter = 0;
        int freq = s.length() / 3;
        
        char[]ch = s.toCharArray();
        
        if(s.length() > 3 || s.length() <= 99 || s.length() % 3 == 0) {

            for(int i = 0; i < s.length()-1; i+=3) {

                if(s.charAt(i)!='S') {
                    counter++;
                }
                
                if(s.charAt(i+1)!='O') {
                    counter++;
                }
                
                if(s.charAt(i+2)!='S') {
                    counter++;
                }
                
            }
        }

        return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
