import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game, int i) {
  
        if(i < 0 || game[i] == 1){
            return false;
        }
        
        if(i + 1 >= game.length || i + leap >= game.length) {
            return true;
        }

        game[i] = 1;

        return canWin(leap, game, i + leap)
                || canWin(leap, game, i + 1)
                || canWin(leap, game, i - 1);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game, 0)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

// https://github.com/sknsht/HackerRank/blob/master/Java/Data%20Structures/Java%201D%20Array%20(Part%202)/Solution.java
// https://github.com/RodneyShag/HackerRank_solutions/blob/master/Java/Data%20Structures/Java%201D%20Array%20(Part%202)/Solution.java
// https://javagoodpractices.blogspot.com/2019/03/java-1d-array-part-2-hackerrank-solution.html
// https://hackerranksolve.blogspot.com/2016/04/java-1d-array-part-2-you-are-playing.html
// https://github.com/egalli64/bitingcode/blob/master/src/hackerrank/challenges/dataStructures/java_1d_array/Solution.java