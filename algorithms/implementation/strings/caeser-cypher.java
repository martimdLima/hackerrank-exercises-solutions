import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

  // Complete the caesarCipher function below.
  static String caesarCipher(String s, int k) {
    
    // create constants to hold the first and last letters and the size of the alphabet 
    final char LETTER_A = 'a';
    final char LETTER_Z = 'z';
    final int ALPHABET_SIZE = LETTER_Z - LETTER_A + 1;

    // initialize the StringBuilder Object
    StringBuilder codedString = new StringBuilder();

    // iterate through the string converted to an array of characters
    for (char character : s.toCharArray()) {
        // check if the character is not empty and if it is a letter
      if (character != ' ' && Character.isLetter(character)) {
        // check if the character is Uppercase or not
        if (Character.isUpperCase(character)) {
          int originalAlphabetPosition =
            Character.toLowerCase(character) - LETTER_A;
          int newAlphabetPosition =
            (originalAlphabetPosition + k) % ALPHABET_SIZE;
          char newCharacter = (char) (LETTER_A + newAlphabetPosition);
          codedString.append(Character.toUpperCase(newCharacter));
        } else {
          int originalAlphabetPosition = character - LETTER_A;
          int newAlphabetPosition =
            (originalAlphabetPosition + k) % ALPHABET_SIZE;
          char newCharacter = (char) (LETTER_A + newAlphabetPosition);

          codedString.append(newCharacter);
        }
      } else {
        codedString.append(character);
      }
    }
    
    return codedString.toString();
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(
      new FileWriter(System.getenv("OUTPUT_PATH"))
    );

    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    String s = scanner.nextLine();

    int k = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    String result = caesarCipher(s, k);

    bufferedWriter.write(result);
    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();
  }
}
