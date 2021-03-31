import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static int birthdayCakeCandles(List<Integer> candles) {
        
        long max = 0;
        long counter = 0;
        
        if(candles.size() >= 1 && candles.size() <= Math.pow(10,5)) {
             for(int i = 0; i < candles.size(); i++) {
            
                if(candles.get(i) >= 1 && candles.get(i) <= Math.pow(10,7) ) {
                    if(candles.get(i) > max) {
                        max = candles.get(i);
                        counter = 1;
                    } else if(candles.get(i) == max) {
                        counter++;
                    }
                }
            }
        }
       
        return (int) counter;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] candlesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> candles = new ArrayList<>();

        for (int i = 0; i < candlesCount; i++) {
            int candlesItem = Integer.parseInt(candlesTemp[i]);
            candles.add(candlesItem);
        }

        int result = Result.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

