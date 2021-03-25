import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(List<Integer> arr) {
        
        HashMap<Integer, Integer> birds = new HashMap<Integer, Integer>();
        
        for(int num : arr) {
            
            if(birds.containsKey(num)) {
                birds.put(num, birds.get(num) + 1);
            } else {
                birds.put(num, 1);
            }        
        }
        
        int freq = 0;
        int type = 0;
        
        for (Map.Entry<Integer, Integer> e : birds.entrySet()) {
        
            if(e.getValue() > freq) {
                
                freq = e.getValue();
                type = e.getKey();
            }
            
            if(e.getValue() == freq && e.getKey() < type) {
                type = e.getKey();
            } 
        }

        return type;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr.add(arrItem);
        }

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
