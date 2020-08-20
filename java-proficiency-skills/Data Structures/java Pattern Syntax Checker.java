import java.util.Scanner;
import java.util.regex.*;

public class Solution {

    private static Scanner in = new Scanner(System.in);

	public static void main(String[] args){

		int testCases = Integer.parseInt(in.nextLine());
		
        while(testCases-->0){
			String pattern = in.nextLine();
            
            try {
                Pattern pt = Pattern.compile(pattern);
                System.out.println("Valid");

            } catch (PatternSyntaxException ex) {
                System.out.println("Invalid");
            }
		}
	}
}



