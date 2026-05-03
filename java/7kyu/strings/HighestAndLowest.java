// Kyu: 7
// Problem: Find highest and lowest number in a string
// Approach: split string, parse integers, track min and max

public class Kata {
  public static String highAndLow(String numbers) {
    String[] num = numbers.split(" ");
    
    int max = Integer.parseInt(num[0]);
    int min = Integer.parseInt(num[0]);
    
    for(String s : num) {
      
      int n = Integer.parseInt(s);
      
      if(n > max) {
        max = n;
      }
      
      if(n < min) {
        min = n;
      }
    }
    
    return max + " " + min;
  }
}
