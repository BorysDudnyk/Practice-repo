// Kyu: 8
// Problem: Sum all numbers in array
// Method: Arrays.stream().sum()

import java.util.Arrays;

public class SumArray {

  public static double sum(double[] numbers) {
    /*double sum = 0;

    for(double i : numbers) {
      sum += i;
    }
    
    return sum;*/
    
    return Arrays.stream(numbers).sum();
  }
}
