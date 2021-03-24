import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        
        int counter = 0;
        
        for(int i = 0; i < n; i++) {
            
            counter++;
            String s = "";
            
            for(int x = 0; x < n; x++) {
                
                if(counter + x < n) {
                    s = s + " ";
                } else {
                    s = s + "#";
                }    
            }
            System.out.println(s);
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
