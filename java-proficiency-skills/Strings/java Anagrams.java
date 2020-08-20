import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        
        boolean isAnagram = false;
        java.util.List<String> arrA = new java.util.ArrayList<>();
        java.util.List<String> arrB = new java.util.ArrayList<>();

        if (a.length() != b.length()) { 
            return false; 
            }

        for(int i = 0; i < a.length(); i++) {  
        arrA.add(a.toLowerCase().split("(?!^)")[i]);
        arrB.add(b.toLowerCase().split("(?!^)")[i]);
        }  

        java.util.Collections.sort(arrA);
        java.util.Collections.sort(arrB);

        for(int i = 0; i < a.length(); i++) {

            if(arrA.get(i).equals(arrB.get(i))){
                isAnagram = true;
            } else {
                isAnagram = false;
                break;
            }
        }
        return isAnagram;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}