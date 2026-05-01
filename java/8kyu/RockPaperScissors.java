// Kyu: 8
// Problem: Rock Paper Scissors game logic
// Rules: rock > scissors, scissors > paper, paper > rock

public class Kata {
  public static String rps(String p1, String p2) {
    
    if (p1.equals(p2)) {
      return "Draw!";
    }
    
    if ((p1.equals("rock") && p2.equals("scissors")) ||
        (p1.equals("scissors") && p2.equals("paper")) ||
        (p1.equals("paper") && p2.equals("rock"))) {
      return "Player 1 won!";
    }
  
    return "Player 2 won!";
  }
}
