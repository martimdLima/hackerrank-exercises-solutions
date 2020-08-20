import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> set = new HashSet<>();

        int counter = 0;
        int result = 0;
        String name = "";

        while(counter < t) {

            name = pair_left[counter] + " " + pair_right[counter];

            if(!set.contains(name)) {

                 set.add(name);
                 result++;
                 System.out.println(result);
            } else {
                System.out.println(result);
            }
            counter++;
        }
    }
}