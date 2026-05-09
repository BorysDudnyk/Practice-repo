// Kyu: 7
// Problem: Check if number is a perfect square
// Method: sqrt + integer validation

public class Square {    
    public static boolean isSquare(int n) {        
      if(n < 0){
        return false;
      }
      
      double sqrt = Math.sqrt(n);

      return (sqrt % 1 == 0);
    }
}
