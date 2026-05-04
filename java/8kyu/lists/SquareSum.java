// Kyu: 8
// Problem: Square each number and sum results
// Method: Arrays.stream().map().sum()

import java.util.Arrays;

public class Kata {
  public static int squareSum(int[] n) { 
    
    /*int sum = 0;
    
    for(int sq : n) {
      sum += sq * sq; 
    }
    
    return sum;*/
    
    return Arrays.stream(n)
      .map(x -> x * x)
      .sum();
  }
}
