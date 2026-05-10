// Kyu: 8
// Problem: Extract age from string
// Method: char to int conversion

public class CharProblem {
  public static int howOld(final String herOld) {
    
    return Character.getNumericValue(herOld.charAt(0));
  
  }
}
