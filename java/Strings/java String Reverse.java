//////////////////////////////////////////////////////////// V1 /////////////////////////////////////////////
import java.io.*;
import java.util.*;

public class Solution {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        String s=sc.next();
        int l = s.length();

        StringBuilder sb=new StringBuilder(s);  
        String reverse = sb.reverse().toString(); 

        if(s.equals(reverse)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

//////////////////////////////////////////////////////////// V2 /////////////////////////////////////////////

// Two test cases failing;

import java.io.*;
import java.util.*;

public class Solution {

    private static Scanner sc = new Scanner(System.in);
    private static String YES = "Yes";
    private static String NO = "No";

    public static void main(String[] args) {
        
        String s=sc.next();
        int l = s.length();
        String reverse = "";

        if(s.length()/2==0) {

            StringBuilder reverse = new StringBuilder(s.substring(l/2+1, l));
    
            if(s.substring(0,l/2).equals(reverse)){
                System.out.println(YES);
            } else {
                System.out.println(NO);
            }

        } else {
            StringBuilder sbr = new StringBuilder(s.substring(l/2+1,l));

            reverse = sbr.reverse().toString() + s.substring(l/2,l/2+1) + s.substring(l/2+1,l);

            if(s.equals(reverse)){
                System.out.println(YES);
            } else {
                System.out.println(NO);
            }

        } 
    }
}




