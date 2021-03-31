import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	private static Scanner scan = new Scanner(System.in);

    public static String getSmallestAndLargest(String s, int k) {

        List<String> arr = new ArrayList<>();

        for(int i = 0; i <= s.length()-k; i++){
            arr.add(s.substring(i, i + k));
        }

        Collections.sort(arr);

        String smallest = arr.get(0);
        String largest = arr.get(arr.size()-1);
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}