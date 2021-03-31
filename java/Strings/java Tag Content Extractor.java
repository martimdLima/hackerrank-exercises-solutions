import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{

    public static Scanner in = new Scanner(System.in);
    public static String PATTERN = "<(.+)>([^<]+)</\\1>";

    public static void main(String[] args){
        
        int testCases = Integer.parseInt(in.nextLine());
        
        while(testCases>0){
            
            boolean match = false;

            int counter = 0;

            String line = in.nextLine();

            Pattern pattern = Pattern.compile(PATTERN);

            Matcher matcher = pattern.matcher(line);

            // if matcher.find() is true, matcher.group(0) will return the full line, matcher.group(1) the matching tag,
            // and matcher.group(2) will return the content that is between the tags 

            while(matcher.find()){
                System.out.println(matcher.group(2));
                match = true;
            }

            if(!match) {
                System.out.println("None");
            }

            testCases--;
            counter++;
        }
    }
}

