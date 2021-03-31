import java.io.*;
import java.util.*;

public class Solution {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String s = scan.nextLine();
        String regex = "[ !,?._'@]+";

        ArrayList<String> arr = new ArrayList<String>(Arrays.asList(s.trim().split(regex)));

        if(s.trim().equals("")) {
            arr.add(0,String.valueOf(0));
        } else {
          arr.add(0,String.valueOf(arr.size()));
        }


        for(String str : arr){
            System.out.println(str);
        }

        scan.close();
    }
}