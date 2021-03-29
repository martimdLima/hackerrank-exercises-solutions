import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
/* 
    int n: Bobby's initial amount of money
    int c: the cost of a chocolate bar
    int m: the number of wrappers he can turn in for a free bar 
*/

    static int chocolateFeast(int n, int c, int m) {
        
        int money = n;
        int price = c;
        int wrappers = m;
        
        // to get the total chocolates, we divide the money/price
        // the total wrappers initially are equal to the number of chocolates
        int tChocolates = money/price;
        int tWrappers = tChocolates;
        
        // iterate while the total wrappers are bigger or equal
        // to the amount needed to trade a free chocolate
        while(tWrappers >= wrappers) {
            // get the extra chocolates that can be traded for the wrappers
            // add the extra chocolates to the total and calculate the total wrappers
            int extra = tWrappers/wrappers;
            tChocolates += extra;
            tWrappers = extra + tWrappers%wrappers;
        }

    return tChocolates;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] ncm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(ncm[0]);

            int c = Integer.parseInt(ncm[1]);

            int m = Integer.parseInt(ncm[2]);

            int result = chocolateFeast(n, c, m);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
