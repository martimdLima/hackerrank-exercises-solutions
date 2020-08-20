import java.io.*;
import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int arrLength = Integer.parseInt(scanner.nextLine());
 
        String line = scanner.nextLine();
        List<String> list = new ArrayList<>();
        List<String> actList = new ArrayList<>(); 

        for(int i = 0; i < line.split(" ").length; i ++) {
            list.add(line.split(" ")[i]);
        }

        int numQ = Integer.parseInt(scanner.nextLine());


        while(scanner.hasNext()) {

            String act = scanner.nextLine();

            if(act.equals("Insert")) {

                String command = scanner.nextLine();

                if(command.split(" ").length > 0) {
                    System.out
                    list.add(Integer.parseInt(command.split(" ")[1]),command.split(" ")[0]);
                }
                list.add(command.split(" ")[0]);    
            }

            if(act.equals("Delete")) {

                String command = scanner.nextLine();

                if(command.split(" ").length < 1) {
                    list.remove(Integer.parseInt(command));
                } 
            }
        }

    }
}