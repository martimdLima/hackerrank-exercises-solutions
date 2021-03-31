import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numEle = in.nextInt();

        in.nextLine();

        String str1 = in.nextLine();

        List<Integer> nums = new ArrayList<>();

        for(String str : str1.split(" ")){
            nums.add(Integer.parseInt(str));
        }

        int numQueries = in.nextInt();

        in.nextLine();

        int counter = 0;

        while(numQueries-->0) {

            String inst = in.nextLine();

            String eles = in.nextLine();

            if(inst.equals("Insert")) {

                int pos = Integer.parseInt(eles.split(" ")[0]);
                int ele = Integer.parseInt(eles.split(" ")[1]);

                nums.add(pos, ele);
            }

            if(inst.equals("Delete")) {
                nums.remove(Integer.parseInt(eles));
            }
        }
        
        for(Integer num : nums) {
            System.out.print(num+" ");
        }
    }
}