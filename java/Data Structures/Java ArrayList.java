import java.io.*;
import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int queryNum = Integer.parseInt(scanner.nextLine());
        List<String> queries = new ArrayList<>();
        List<String> queriesPos = new ArrayList<>();

        for(int i = 0; i < queryNum; i++) {

            String query = scanner.nextLine();

            queries.add(query);
        }

        queryNum = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < queryNum; i++) {

            String query = scanner.nextLine();

            queriesPos.add(query);
        }

        for(int i = 0; i < queriesPos.size(); i++) {

            int row = Integer.parseInt(queriesPos.get(i).split(" ")[0])-1;
            int col = Integer.parseInt(queriesPos.get(i).split(" ")[1]); 

                if(queries.get(row).split(" ").length <1 || col > queries.get(row).split(" ").length-1) {
                System.out.println("ERROR!");
            } else {
                System.out.println(queries.get(row).split(" ")[col]);
            }
        }
    }
}
