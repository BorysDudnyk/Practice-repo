// Kyu: 6
// Problem: Find highest scoring word
// Method: character scoring (a=1..z=26)

public class Kata {

  public static String high(String s) {
    String winner = "";
    int maxScore = 0;
    
    String[] words = s.split(" ");
    
    
    for (String word : words) {
        int currentScore = 0;
        
        for (char c : word.toCharArray()) {
            currentScore += (c - 96);
        }
    
    if (currentScore > maxScore) {
            maxScore = currentScore;
            winner = word;
        }
    }
    
    return winner;
  }

}
