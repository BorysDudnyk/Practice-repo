// Kyu: 8
// Problem: Calculate required paperwork pages
// Approach: guard clause for negative values

public class Paper {
  public static int paperWork(int n, int m) {
    if(n < 0 || m < 0){
      return 0;
    }
    
    return m * n;
  }
}
