import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        
        String day = String.valueOf(256 - (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31));
        String leapDay = String.valueOf(256 - (31 + 29 + 31 + 30 + 31 + 30 + 31 + 31));
       
        String date = day + "." + "09" + "." + year;
        String leapDate = leapDay + "." + "09" + "." + year;
        String result = date;
        
        if((year >= 1700 && year <= 1917) && year%4 == 0) {
            System.out.println(leapDate);
            result = leapDate;
        } 
        
        if(year == 1918) {
            result = String.valueOf(269 - (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31))+ "." + "09" + "." + year;
        }
        
        if(year >= 1919 && ((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
            result = leapDate;
        } 
        
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
