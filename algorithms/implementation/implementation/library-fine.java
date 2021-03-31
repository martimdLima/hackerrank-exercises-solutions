import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
/* 
If the book is returned on or before the expected return date, no fine will be charged
If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, .
If the book is returned after the expected return month but still within the same calendar year as the expected return date, the .
If the book is returned after the calendar year in which it was expected, there is a fixed fine of .
Charges are based only on the least precise measure of lateness. For example, whether a book is due January 1, 2017 or December 31, 2017, if it is returned January 1, 2018, that is a year late and the fine would be .

*/

    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        String dt1 = d1 < 10 ? "0" + d1 + "/" + m1 + "/" + y1 : "" + d1 + "/" + m1 + "/" + y1;
        String dt2 = d2 < 10 ? "0" + d2 + "/" + m2 + "/" + y2 : "" + d2 + "/" + m2 + "/" + y2;
        
        
        Date firstDate = null;
        Date secondDate = null;
        Calendar cal=Calendar.getInstance();
        
        int days1 = 0;
        int months1 = 0;
        int year1 = 0;
        int days2 = 0;
        int months2 = 0;
        int year2 = 0;
        int fine = 0;
        
        try {
            firstDate = sdf.parse(dt1);
            secondDate = sdf.parse(dt2);
            
            cal.setTime(firstDate);
            days1=cal.get(Calendar.DAY_OF_MONTH);
            months1=cal.get(Calendar.MONTH);
            year1=cal.get(Calendar.YEAR);
            cal.setTime(secondDate);
            days2=cal.get(Calendar.DAY_OF_MONTH);
            months2=cal.get(Calendar.MONTH);
            year2=cal.get(Calendar.YEAR);
        }catch(ParseException ex) {
           System.out.println(ex);
        }
        
        
        if(d1 <= d2 && m1 <= m2 && y1 <= y2) {
            return fine;
        }
        
        if(d1 > d2 && m1 == m2 && y1 == y2) {
            
            fine = 15 * (days1 - days2) ;
            return fine;
        }
        
        if(m1 > m2 && y1 == y2) {

             fine = 500 * (months1 - months2);
             return fine;
        }
        
        if(y1 > y2) {
            fine = 10000;
            return fine;
        }
        
        return 0; 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] d1M1Y1 = scanner.nextLine().split(" ");

        int d1 = Integer.parseInt(d1M1Y1[0]);

        int m1 = Integer.parseInt(d1M1Y1[1]);

        int y1 = Integer.parseInt(d1M1Y1[2]);

        String[] d2M2Y2 = scanner.nextLine().split(" ");

        int d2 = Integer.parseInt(d2M2Y2[0]);

        int m2 = Integer.parseInt(d2M2Y2[1]);

        int y2 = Integer.parseInt(d2M2Y2[2]);

        int result = libraryFine(d1, m1, y1, d2, m2, y2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

