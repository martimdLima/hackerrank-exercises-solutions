import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the pangrams function below.
    static String pangrams(String s) {

        String result = "";
        String toCheck = s.replaceAll("\\s", "");
        String alphabet = "abcdefghijklmnopqrstuvxz";

        if (s.length() <= 0 || s.length() > Math.pow(10, 3)) {
            result = "not pangram";
        }

        if (stringToCharacterSet(toCheck).containsAll(stringToCharacterSet(alphabet))) {
            result = "pangram";
        } else {
            result = "not pangram";
        }

        return result;
    }

    public static Set<Character> stringToCharacterSet(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {

            if (Character.isLetterOrDigit(c) || !Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                set.add(Character.toLowerCase(c));
            }

        }
        return set;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
