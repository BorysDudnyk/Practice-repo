// Kyu: 7
// Problem: Check if string is an isogram (no repeating letters)
// Approach: use HashSet to track unique characters

import java.util.Set;
import java.util.HashSet;

public class isogram {
    public static boolean  isIsogram(String str) {
      str = str.toLowerCase();
      
      Set<Character> letters = new HashSet<>();
      
      for (char c : str.toCharArray()) {
        
            if (letters.contains(c)) {
                return false;
            }
            letters.add(c);
        }
        
        return true;
    } 
}
