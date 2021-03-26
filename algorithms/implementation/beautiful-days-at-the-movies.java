import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        
        int counter = 0;
        int start = i;
        int end = j;
        
        for(int x=start; x<=end; x++) {
            if(Math.abs(x - reverseNumber(x))%k==0) {
                counter++;
            }
        }

        return counter;
    }
    
    static int reverseNumber(int number) {  
        
        int reversed = 0;
        
      while(number != 0) {
    
      int digit = number % 10;
        reversed = reversed * 10 + digit;
        number /= 10;
    }
    
        return reversed;
    }  
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
