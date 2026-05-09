// Kyu: 7
// Problem: Find next perfect square
// Method: sqrt + validation

public class NumberFun {
  public static long findNextSquare(long sq) {
    
    long newSq = (long) Math.sqrt(sq);
    if(newSq * newSq == sq){
      long nextSq = newSq + 1;
      return nextSq * nextSq;
    }
    
    return -1;
  }
}
