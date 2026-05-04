// Kyu: 7
// Problem: Square each digit and concatenate result
// Approach: convert to string, iterate chars, build result

public class SquareDigit {

  public int squareDigits(int n) {
    String strNum = String.valueOf(n);
    StringBuilder result = new StringBuilder();
    
    for(char c : strNum.toCharArray()) {
      int digit = Character.getNumericValue(c);
      
      result.append(digit * digit);
    }
    
    return  Integer.parseInt(result.toString());
  }
}
