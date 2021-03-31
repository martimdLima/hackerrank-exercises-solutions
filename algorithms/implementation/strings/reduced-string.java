private static String superReduced(String s){

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
        
            // Complete the superReducedString function below.
            static String superReducedString(String s) {
              
                // if the string is empty there is no point in continuing
                if(s.isEmpty()){
                    return "Empty String";
                }

                // check if the string length is 1 there is also no point in continuing
                if(s.length() == 1){
                    return s;
                }

                // loop through all the char elements in the string, if a copy is detected, 
                // return the method with the string without that char
                for(int i = 0; i < s.length() -1; i++){
                   if(s.charAt(i+1) == s.charAt(i)){
                       return superReducedString(s.substring(0,i)+s.substring(i+2, s.length()));
                    }
                }
                return s;
            }
        
            public static void main(String[] args) throws IOException {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
                String s = bufferedReader.readLine();
        
                String result = superReducedString(s);
        
                bufferedWriter.write(result);
                bufferedWriter.newLine();
        
                bufferedReader.close();
                bufferedWriter.close();
            }
        }

}}