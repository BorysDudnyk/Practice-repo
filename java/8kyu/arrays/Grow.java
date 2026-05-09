// Kyu: 8
// Problem: Multiply all elements of array
// Method: reduce / loop

import java.util.Arrays;

public class Kata{

  public static int grow(int[] x){

    /*int res = 1;
    for(int num : x){
      res *= num;
    }
    
    return res;*/
    
    return Arrays.stream(x)
      .reduce(1, (a, b) -> a * b);
  
  }

}
