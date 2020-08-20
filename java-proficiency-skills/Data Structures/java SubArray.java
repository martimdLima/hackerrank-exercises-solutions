import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int arrayLength = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        int negSubArr = 0;

        while(scanner.hasNext()) {

            int num = scanner.nextInt();
            arr.add(num);
        } 


        while(arr.size() > 0) {

            int sum = 0;

           for(int i = 0; i < arr.size(); i++) {

            sum += arr.get(i);

                if(sum < 0) {
                    negSubArr++;
                }
            }
           arr.remove(0);
        }

        System.out.print(negSubArr);
    }
}